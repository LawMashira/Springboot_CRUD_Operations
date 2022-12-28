package com.java.springboot.service;

import java.util.List;

import com.java.springboot.mode.Student;

public interface StudentService {
public Student saveStudent(Student student);

public List<Student> getAllStudents();

public Student get(Integer id);

 public void delete(Integer id);
}
