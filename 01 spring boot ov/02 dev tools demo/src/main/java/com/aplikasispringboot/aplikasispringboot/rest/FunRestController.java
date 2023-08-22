package com.aplikasispringboot.aplikasispringboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public class FunRestController {

	
	

	// expose"/" that return "hello world"
	
		@GetMapping("/")
			public String sayHello() {
			return "hello ";
			
		}
		
		//expose a new endpoint for"workout"
		@GetMapping("/workout")
		public String getDailyWorkout()
		{
			return "run a hard 5k";
		}
		
		//expose a new endpoint for"workout"
				@GetMapping("/geblek")
				public String geblek()
				{
					return "run geblekgeblekgeblekgeblekgeblekgeblek 5k";
				}
				
				@GetMapping("/geblekgeblek")
				public String geblekgeblek()
				{
					return "run ubahubah 5k";
				}
				
				@GetMapping("/tera")
				public String tera()
				{
					return "tera tera 5k";
				}
}
