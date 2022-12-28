package com.java.springboot.mode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int ID;
	@Column(name="Name",nullable = false)
private String name;
	@Column(name="Address",nullable = false)
private String address;
 public Student() {
	 
 }
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
 
}
