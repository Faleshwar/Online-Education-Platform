package com.onlineeducation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineeducation.model.Course;
import com.onlineeducation.repo.CourseRepository;

@Service
public class CourseServices {

	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getCourses(){
		return courseRepository.findAll();
	}
	
	
	public List<Course> getCourse(String courseName) {
		List<Course> coursesList = courseRepository.getCourseByCourseTitle(courseName);
		return coursesList;
	}
	
	
	public void addCourse(Course course) {
		this.courseRepository.save(course);
	}
}
