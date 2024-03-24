package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseService implements CourseService{

	@Override
	public void courseInfo() {
		// TODO Auto-generated method stub
		System.out.println("Java Full Stack Course");
		System.out.println("Core java, Adv java, Spring, Boot, Microservices.....");
	}

}
