package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("happytenniscoach", Coach.class);

		Coach alphacoach = context.getBean("happytenniscoach", Coach.class);
		System.out.println(coach == alphacoach);
		context.close();
	}

}
