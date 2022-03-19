package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;
	
	public List<Employee> getAllEmployeeRecords()
	{
		return employeeRepo.findAll();
		}
	
	public Employee insertEmployeeDetails(Employee employee)
	{
		return employeeRepo.save(employee);
	}

	
	}


