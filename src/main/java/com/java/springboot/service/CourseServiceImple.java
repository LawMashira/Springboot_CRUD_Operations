package com.java.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.springboot.mode.StudentCourse;
import com.java.springboot.repository.CourseRepository;
@Service
public class CourseServiceImple implements CourseService{
	@Autowired
	private CourseRepository courseRepository;
	@Override
	public StudentCourse saveCourse(StudentCourse studentCourse ) {
		return courseRepository.save(studentCourse);
	}
	

}
