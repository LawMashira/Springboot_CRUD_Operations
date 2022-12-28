package com.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springboot.mode.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
