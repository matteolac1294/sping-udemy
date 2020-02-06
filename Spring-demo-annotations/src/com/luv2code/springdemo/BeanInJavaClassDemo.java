package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInJavaClassDemo {
	public static void main(String[] args) {

AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(SportConfig.class);

		SwimCoach sCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(sCoach.getDailyFortune());
		
		System.out.println(sCoach.getEmail());
		System.out.println(sCoach.getTeam());
		
		context.close();
	}
}
