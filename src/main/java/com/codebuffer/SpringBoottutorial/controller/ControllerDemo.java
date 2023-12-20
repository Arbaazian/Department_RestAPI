package com.codebuffer.SpringBoottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {
	
	@GetMapping("/")
	public String helloWorld() {
		
		return "Welcome to my page";
	}
	

}
