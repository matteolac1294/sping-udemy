package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneservice;

	public BaseballCoach(FortuneService fService) {

		this.fortuneservice = fService;
	}

	public String getDailyWorkout() {
		return "spend 30 minutes in the cage ";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getFortune();
	}
}
