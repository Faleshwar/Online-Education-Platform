package com.onlineeducation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineeducation.model.Course;
import com.onlineeducation.services.CourseServices;

@RestController
@RequestMapping("/ins")
public class InstructorController {
	
	@Autowired
	private CourseServices courseServices;
	
	
	@PostMapping("/add")
	public ResponseEntity<Integer> addCourse(@RequestBody Course course){
		courseServices.addCourse(course);
		return new ResponseEntity<>(course.getId(), HttpStatus.CREATED);
	}
	
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> show() {
		List<Course> courses = courseServices.getCourses();
		return new ResponseEntity<>(courses, HttpStatus.OK);
	}

}
