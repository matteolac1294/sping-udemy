package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	

	@Override
	public String getDailyWorkout() {
		return "run 300 miles";
	}

	@Override
	public String getDailyFortune() {
	
		return "track luck";
	}

	
	public void build() {
		System.out.println("building object");
	}
	
	public void destroy() {
		System.out.println("destroying object");
	}
	
}
