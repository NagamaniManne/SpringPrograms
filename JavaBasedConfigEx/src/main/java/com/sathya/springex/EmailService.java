package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService{

	@Override
	public void message() {
		System.out.println("Your email is registered, please check your email for updates");
	}

}
