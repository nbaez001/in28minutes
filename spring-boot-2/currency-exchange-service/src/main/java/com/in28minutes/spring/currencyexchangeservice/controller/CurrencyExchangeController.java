package com.in28minutes.spring.currencyexchangeservice.controller;

import com.in28minutes.spring.currencyexchangeservice.model.ExchangeValue;
import com.in28minutes.spring.currencyexchangeservice.repository.ExchangeValueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

  private final Environment environment;
  private final ExchangeValueRepository exchangeValueRepository;
  private final Logger log = LoggerFactory.getLogger(CurrencyExchangeController.class);

  public CurrencyExchangeController(
      Environment environment, ExchangeValueRepository exchangeValueRepository) {
    this.environment = environment;
    this.exchangeValueRepository = exchangeValueRepository;
  }

  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
    ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
    exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
    log.info("{}", exchangeValue);

    return exchangeValue;
  }
}
