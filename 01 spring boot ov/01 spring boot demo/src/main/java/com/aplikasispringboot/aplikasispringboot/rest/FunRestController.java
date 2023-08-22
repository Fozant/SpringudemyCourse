package com.aplikasispringboot.aplikasispringboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public class FunRestController {

	
	

	// expose"/" that return "hello world"
	
		@GetMapping("/")
			public String sayHello() {
			return "hello world";
			
		}
}
