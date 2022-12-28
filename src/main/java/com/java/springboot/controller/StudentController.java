package com.java.springboot.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.mode.Student;
import com.java.springboot.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
@Autowired
private StudentService studentService;

@PostMapping("/addingstudents")

public String add(@RequestBody Student student) {
	studentService.saveStudent(student);
	return "New student successifully added";
	
}

@GetMapping("/gettingallstudents")

public List<Student> getAllStudents(){
	return studentService.getAllStudents();
	}
@GetMapping("/{id}")
public ResponseEntity<Student> get(@PathVariable Integer id){
	try {
		Student student = studentService.get(id);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
	}catch(NoSuchElementException e1) {
		return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
   }
//updating the student information
@PutMapping("/{id}")
public ResponseEntity<Student> update(@RequestBody Student student,@PathVariable Integer id){
	try {
	    studentService.get(id);
		studentService.saveStudent(student);
		return  new ResponseEntity<> (HttpStatus.OK);
	}catch(NoSuchElementException e1) {
		return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
   }
@DeleteMapping("/{id}")
public String deleteStudent(@PathVariable Integer id) {
	studentService.delete(id);
	return "Student successfully deleted  with ID "+id ;
   }
}
