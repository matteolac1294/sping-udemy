package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private String emailAddress;
	private String team;
	private FortuneService fortuneservice;

	public CricketCoach() {
		System.out.println("inside cricket");
	}

	@Override
	public String getDailyWorkout() {
		return "practice cricket fatass";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune();
	}

	public FortuneService getFortuneservice() {
		return fortuneservice;
	}

	public void setFortuneservice(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("setEmail");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("setTeam");
		this.team = team;
	}

}
