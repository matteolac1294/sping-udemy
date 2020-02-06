package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemo {
	public static void main(String[] args) {

AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(SportConfig.class);

		CricketCoach cCoach = context.getBean("cricketCoach", CricketCoach.class);

		System.out.println(cCoach.getDailyFortune());
		
		context.close();
	}
}
