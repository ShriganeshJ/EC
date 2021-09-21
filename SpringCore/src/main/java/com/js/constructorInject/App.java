package com.js.constructorInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
       
       IdfcBank i = ctx.getBean(IdfcBank.class);
      
    }
}
