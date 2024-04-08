package com.onlineeducation.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	
	private int Id;
	
	private String courseTitle;
	
	private String courseDescription;
	
	private Date enrollDate;

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

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public Course(int id, String courseTitle, String courseDescription, Date enrollDate) {
		super();
		Id = id;
		this.courseTitle = courseTitle;
		this.courseDescription = courseDescription;
		this.enrollDate = enrollDate;
	}

	public Course() {
		super();
	}
	
	

}
