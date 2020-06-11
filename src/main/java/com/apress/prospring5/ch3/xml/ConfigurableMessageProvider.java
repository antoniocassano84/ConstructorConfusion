package com.apress.prospring5.ch3.xml;

public class ConfigurableMessageProvider implements MessageProvider {
  private String message;

  public ConfigurableMessageProvider(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return this.message;
  }
}
