package com.udemy.spingAnnotations;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Inside method: HappyFortuneService.getDailyFortune" ;
	}

}
