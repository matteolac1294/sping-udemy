package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortune;

	@Override
	public String getDaylyWorout() {
		return "do cricket";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
