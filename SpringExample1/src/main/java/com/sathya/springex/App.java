package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
    	Greeting greeting=context.getBean("greet", GreetingImpl.class);
    	greeting.greet();
    }
}
