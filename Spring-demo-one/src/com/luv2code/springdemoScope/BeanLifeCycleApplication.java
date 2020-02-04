package com.luv2code.springdemoScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.TrackCoach;

public class BeanLifeCycleApplication {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("InitDestroyapplicationContext.xml");
	
	TrackCoach  coach = context.getBean("myCoach", TrackCoach.class);
	
	
	context.close();
}
}
