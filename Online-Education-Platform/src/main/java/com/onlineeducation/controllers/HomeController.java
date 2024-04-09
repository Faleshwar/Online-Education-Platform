package com.onlineeducation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineeducation.model.Course;
import com.onlineeducation.model.Login;
import com.onlineeducation.model.User;
import com.onlineeducation.services.CourseServices;
import com.onlineeducation.services.UserService;

@RestController
public class HomeController {
	
	@Autowired
	private CourseServices courseServices;
	
	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<Integer> register(@RequestBody User user) {
		userService.addUser(user);
		return new ResponseEntity<>(user.getId(),HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Login login) {
	  boolean isValid = userService.checkByUserNameAndPassword(login);
	  return isValid?"Login succes! ":"Username or password wrong!";
	}
	
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return this.courseServices.getCourses();
	}
	
}
