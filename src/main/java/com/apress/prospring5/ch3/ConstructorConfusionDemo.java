package com.apress.prospring5.ch3;

import com.apress.prospring5.ch3.xml.ConstructorConfusion;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ConstructorConfusionDemo {

  public static void main(String[] args) {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    ctx.load("app-context-xml.xml");
    ctx.refresh();
    ConstructorConfusion cc = (ConstructorConfusion) ctx.getBean("constructorConfusion");
    System.out.println(cc);
    ctx.close();
  }
}
