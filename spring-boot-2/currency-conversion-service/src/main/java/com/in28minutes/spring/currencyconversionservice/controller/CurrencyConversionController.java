package com.in28minutes.spring.currencyconversionservice.controller;

import com.in28minutes.spring.currencyconversionservice.model.CurrencyConversion;
import com.in28minutes.spring.currencyconversionservice.proxy.CurrencyExchangeProxy;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

  private final CurrencyExchangeProxy currencyExchangeProxy;
  private final Logger log = LoggerFactory.getLogger(CurrencyConversionController.class);

  public CurrencyConversionController(CurrencyExchangeProxy currencyExchangeProxy) {
    this.currencyExchangeProxy = currencyExchangeProxy;
  }

  @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
  public CurrencyConversion comvertCuerrency(
      @PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {

    Map<String, String> uriVariables = new HashMap<>();
    uriVariables.put("from", from);
    uriVariables.put("to", to);

    ResponseEntity<CurrencyConversion> responseEntity =
        new RestTemplate()
            .getForEntity(
                "http://localhost:8000/currency-exchange/from/{from}/to/{to}",
                CurrencyConversion.class,
                uriVariables);
    CurrencyConversion response = responseEntity.getBody();
    log.info("{}", response);
    return new CurrencyConversion(
        response.getId(),
        from,
        to,
        response.getConversionMultiple(),
        quantity,
        quantity.multiply(response.getConversionMultiple()),
        response.getPort());
  }

  @GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
  public CurrencyConversion comvertCuerrency2(
      @PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
    CurrencyConversion response = currencyExchangeProxy.retrieveExchangeValue(from, to);
    log.info("{}", response);
    return new CurrencyConversion(
        response.getId(),
        from,
        to,
        response.getConversionMultiple(),
        quantity,
        quantity.multiply(response.getConversionMultiple()),
        response.getPort());
  }
}
