package com.onlineeducation.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "courses")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name = "course_title")
	private String courseTitle;
	
	@Column(name = "course_description")
	private String courseDescription;
	
	@Column(name = "duration")
	private String duration;
	
	private String instructor;

	public Course(int id, String courseTitle, String courseDescription, String duration, String instructor) {
		super();
		Id = id;
		this.courseTitle = courseTitle;
		this.courseDescription = courseDescription;
		this.duration = duration;
		this.instructor = instructor;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public Course() {
		super();
		
	}


	
	

}
