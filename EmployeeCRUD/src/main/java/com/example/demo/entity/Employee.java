package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {
	@Id
private int empId;
private String name;
private String designation;
private double salary;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
