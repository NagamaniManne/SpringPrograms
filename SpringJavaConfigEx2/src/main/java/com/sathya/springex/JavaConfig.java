package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Person person1()
	{
		Person person=new Person();
		person.setName("nagamani");
		person.setEmailId("nagamani@gmail.com");
		return person;
	}
	
	@Bean(name = "secperson")
	public Person person2() {
		Person person=new Person();
		person.setName("pravallika");
		person.setEmailId("pra@abc.com");
		return person;
	}
}
