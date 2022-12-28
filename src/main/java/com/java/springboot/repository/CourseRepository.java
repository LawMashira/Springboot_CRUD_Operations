package com.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springboot.mode.StudentCourse;
@Repository
public interface CourseRepository extends JpaRepository <StudentCourse,  Long> {

}
