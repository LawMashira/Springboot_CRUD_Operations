package com.java.springboot.mode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentcourse")
public class StudentCourse {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	//@Column(name="course_code",nullable =false)
	private String courseCode;
	
	//@Column(name="course_name",nullable =false)
	private String courseName;
public StudentCourse() {
		
	}
	
	public Long getID() {
		return id;
	}

	public void setID(Long iD) {
		id = iD;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	
	
}
