package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println("Object created");
        System.out.println("\n*****************");
        
        Person person=context.getBean("person1",Person.class);
        person.personInfo();
        
        System.out.println("\n******************************");
        Person person2=context.getBean("secperson",Person.class);
        person2.personInfo();
    }
}
