package com.springudemy.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		
		
		return "practice bowling!!!!!";
	}
	

}
