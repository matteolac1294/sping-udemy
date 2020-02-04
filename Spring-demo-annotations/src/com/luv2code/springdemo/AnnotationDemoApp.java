package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach tcoach = context.getBean("happytenniscoach", TennisCoach.class);

		Coach bcoach = context.getBean("baseballCoach", BaseballCoach.class);

		System.out.println(tcoach.getDaylyWorout());

		System.out.println(bcoach.getDaylyWorout());
	}
}
