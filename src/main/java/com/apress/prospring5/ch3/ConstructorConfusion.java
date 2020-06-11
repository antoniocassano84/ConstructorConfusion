package com.apress.prospring5.ch3;

public class ConstructorConfusion {
  private final String someValue;

  public ConstructorConfusion(String someValue) {
    System.out.println("ConstructorConfusion(String) called");
    this.someValue = someValue;
  }

  public ConstructorConfusion(int someValue) {
    System.out.println("ConstructorConfusion(int) called");
    this.someValue = "Number + 1: " + Integer.toString(someValue + 1);
  }

  @Override
  public String toString() {
    return "ConstructorConfusion{" +
            "someValue='" + someValue + '\'' +
            '}';
  }
}
