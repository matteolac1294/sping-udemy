package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "fuck you man";
	}
	
	

}
