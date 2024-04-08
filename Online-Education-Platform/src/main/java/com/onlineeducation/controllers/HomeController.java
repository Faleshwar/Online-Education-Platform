package com.onlineeducation.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineeducation.model.Login;
import com.onlineeducation.model.Student;

@RestController
public class HomeController {

	@PostMapping("/register")
	public String register(@RequestBody Student student) {
		return student.toString();
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Login login) {
		
		
		return login.toString();
	}
	
}
