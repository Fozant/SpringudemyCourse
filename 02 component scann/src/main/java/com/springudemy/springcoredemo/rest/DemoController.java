package com.springudemy.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springudemy.springcoredemo.common.Coach;

@RestController
public class DemoController {

	
	
	
	private Coach myCoach;
	
	
	
	@Autowired
	public DemoController(Coach thechoach) {
		myCoach =thechoach;
	}
	
	@GetMapping("/dailyworkout")
	public String getdailyworkout() {
		
		return myCoach.getdailyworkout();
	}
	
	
	
}
