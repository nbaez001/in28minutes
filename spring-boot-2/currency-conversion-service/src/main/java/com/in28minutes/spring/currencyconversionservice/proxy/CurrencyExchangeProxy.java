package com.in28minutes.spring.currencyconversionservice.proxy;

import com.in28minutes.spring.currencyconversionservice.model.CurrencyConversion;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "gateway-service")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeProxy {

  @GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
  CurrencyConversion retrieveExchangeValue(
      @PathVariable(name = "from") String from, @PathVariable(name = "to") String to);
}
