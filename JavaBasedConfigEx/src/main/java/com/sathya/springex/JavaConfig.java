package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sathya.springex")
public class JavaConfig {
//	@Bean
//	public EmailService emailService()
//	{
//		EmailService emailService = new EmailService();
//		return emailService;
//	}
//	
//	@Bean
//	public JavaCourseService javaCourseService()
//	{
//		JavaCourseService javaCourseService = new JavaCourseService();
//		return javaCourseService;
//	}
//	
//	@Bean
//	public Student student()
//	{
//		Student student = new Student(emailService(),javaCourseService());
////		student.setEmailService(emailService());
////		student.setJavaCourseService(javaCourseService());
//		return student;
//	}
}
