package com.udemy.spingAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	FortuneService fortuneService ;
	
//	@Autowired
//	public CricketCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService ;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Inside spingAnnotations: CricketCoach.getDailyWorkout" ;
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
