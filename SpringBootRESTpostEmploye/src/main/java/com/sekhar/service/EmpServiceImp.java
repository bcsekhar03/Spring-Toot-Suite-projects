package com.sekhar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekhar.model.Employee;
import com.sekhar.repo.EmpRepo;
@Service
public class EmpServiceImp implements EmployService {
	@Autowired
	private EmpRepo repo;

	@Override
	public Employee saveEmploy(Employee emp) {

		Employee e1=repo.save(emp);
		return e1;
	}
	
	public void deleteEmp(Integer empid) {
		repo.deleteById(empid);
	}
	public Employee getone(Integer empid) {
		Employee e2=repo.findById(empid).get();
		return e2;
	}
	public List<Employee> getAll(){
		List<Employee> list=repo.findAll();
		return list;
	}
	public Employee update(Employee emp,Integer empid) {
		Employee e3=repo.findById(empid).get();
		e3.setName(emp.getName());
		e3.setEmail(emp.getEmail());
		e3.setPassword(emp.getPassword());
		e3.setDesignation(emp.getDesignation());
		e3.setSalary(emp.getSalary());
		return repo.save(e3);
	}

	

}
