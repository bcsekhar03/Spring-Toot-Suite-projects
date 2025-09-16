package com.sekhar.service;

import java.util.List;

import com.sekhar.model.Employee;

public interface EmployService {

	public Employee saveEmploy(Employee emp);
	
	public void deleteEmp(Integer empid);
	
	public Employee getone(Integer empid);
	
	public List<Employee> getAll();
	
	public Employee update(Employee emp, Integer empid);
}
