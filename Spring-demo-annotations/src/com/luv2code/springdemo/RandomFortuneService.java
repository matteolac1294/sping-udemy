package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String[] fortunes = { "fortune1", "fortune2", "fortune3" };

	Random ran = new Random();

	@Override
	public String getFortune() {
		int index = ran.nextInt(fortunes.length);

		return fortunes[index];
	}

}
