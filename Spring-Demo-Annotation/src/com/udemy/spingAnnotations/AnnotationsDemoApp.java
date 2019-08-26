package com.udemy.spingAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the beans from the container
		Coach myCoach = (Coach)context.getBean("cricketCoach");
		
		//call the methods
		System.out.println(myCoach.getDailyWorkout());
		//System.out.println(myCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
