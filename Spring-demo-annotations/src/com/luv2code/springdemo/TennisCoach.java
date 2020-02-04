package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("happytenniscoach")
public class TennisCoach implements Coach {

	@Override
	public String getDaylyWorout() {
		return "do tennis asshole";
	}

}
