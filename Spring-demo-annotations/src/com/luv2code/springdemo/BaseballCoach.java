package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	@Autowired
	@Qualifier("badFortuneService")
	private FortuneService fortuneservice;

	@Override
	public String getDaylyWorout() {
		return "do baseball bitch";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune() + " in baseball not in life";
	}

	public FortuneService getFortuneservice() {
		return fortuneservice;
	}
//@Autowired
//	public void setFortuneservice(FortuneService fortuneservice) {
//		this.fortuneservice = fortuneservice;
//	}

}
