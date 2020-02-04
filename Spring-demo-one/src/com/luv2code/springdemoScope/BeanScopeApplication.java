package com.luv2code.springdemoScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class BeanScopeApplication {
	
	
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springScopeapplicationContext.xml");
		
		Coach coach1 = context.getBean("myCoach", Coach.class);
		Coach coach2= context.getBean("myCoach", Coach.class);
		System.out.println(coach1==coach2);
		context.close();
	}

}
