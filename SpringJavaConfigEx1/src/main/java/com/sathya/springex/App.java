package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        
        System.out.println("********************");
        GreetingImpl greetingImpl=context.getBean("greet",GreetingImpl.class);
        greetingImpl.greet();
    }
}
