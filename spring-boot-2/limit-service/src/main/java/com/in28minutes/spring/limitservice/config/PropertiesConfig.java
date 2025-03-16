package com.in28minutes.spring.limitservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "limits-service")
public class PropertiesConfig {
  private int minimun;
  private int maximun;

  public int getMinimun() {
    return minimun;
  }

  public void setMinimun(int minimun) {
    this.minimun = minimun;
  }

  public int getMaximun() {
    return maximun;
  }

  public void setMaximun(int maximun) {
    this.maximun = maximun;
  }
}
