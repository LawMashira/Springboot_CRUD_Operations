package com.java.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.springboot.mode.StudentCourse;
import com.java.springboot.service.CourseService;

@RestController
@RequestMapping("/course")

public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/addingcourse")

	public String add(@RequestBody StudentCourse studentCourse) {
		courseService.saveCourse(studentCourse);
		return "New course successifully added";
		
	}


}
