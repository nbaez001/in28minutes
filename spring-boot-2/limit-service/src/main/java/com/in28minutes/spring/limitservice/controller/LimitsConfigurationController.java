package com.in28minutes.spring.limitservice.controller;

import com.in28minutes.spring.limitservice.config.PropertiesConfig;
import com.in28minutes.spring.limitservice.dto.LimitConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

  private final PropertiesConfig propertiesConfig;

  public LimitsConfigurationController(PropertiesConfig propertiesConfig) {
    this.propertiesConfig = propertiesConfig;
  }

  @GetMapping("/limits")
  public LimitConfiguration retrieveLimitsFromConfiguration() {
    return new LimitConfiguration(propertiesConfig.getMaximun(), propertiesConfig.getMinimun());
  }

  @GetMapping("/fault-tolerance-example")
  @HystrixCommand(fallbackMethod = "fallbackRetrieveConfiguration")
  public LimitConfiguration retrieveConfiguration() {
    throw new RuntimeException("Not Available");
  }

  public LimitConfiguration fallbackRetrieveConfiguration() {
    return new LimitConfiguration(9, 999);
  }
}
