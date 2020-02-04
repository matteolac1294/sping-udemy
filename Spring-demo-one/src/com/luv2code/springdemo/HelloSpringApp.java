package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		// laod the spirng config

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean

		//Coach theCoach1 = context.getBean("myCoach1", Coach.class);
		
		//Coach theCoach2 = context.getBean("myCoach2", Coach.class);
		CricketCoach theCoach3 = context.getBean("myCoach3", CricketCoach.class);

		// call methods

		System.out.println(theCoach3.getDailyWorkout());
		System.out.println(theCoach3.getDailyFortune());
System.out.println(theCoach3.getEmailAddress());
System.out.println(theCoach3.getTeam());
		// close context
		context.close();
	}
}
