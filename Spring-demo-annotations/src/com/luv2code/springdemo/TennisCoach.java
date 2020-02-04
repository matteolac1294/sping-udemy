package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("happytenniscoach")
//@Scope("prototype")
public class TennisCoach implements Coach {

	private HappyFortuneService fortuneservice;

	@Autowired
	public TennisCoach(HappyFortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDaylyWorout() {
		return "do tennis asshole";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune();
	}

	@PostConstruct
	public void build() {
		System.out.println("building");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroying");
	}
}
