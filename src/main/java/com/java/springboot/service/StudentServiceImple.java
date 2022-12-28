package com.java.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springboot.repository.StudentRepo;

import com.java.springboot.mode.Student;

@Service
public class StudentServiceImple implements StudentService {
	@Autowired
	private StudentRepo studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student) ;
	}
	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
		
	}
	
	@Override
	public Student get(Integer id) {
		return studentRepository.findById(id).get();
	}
	public void delete(Integer id) {
		 studentRepository.deleteById(id);
	}
}
