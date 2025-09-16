package com.sekhar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sekhar.model.Employee;
import com.sekhar.service.EmployService;

@RestController
public class EmpController {

	@Autowired
	private EmployService service;
	
	@PostMapping("/save")
	public String saveEmp(@RequestBody Employee emp)
	{
		Employee e1=service.saveEmploy(emp);
		String message=null;
		if(e1 != null)
		{
			message="Employee Data Successfully Inserted into Database";
		}
		else {
			message="Data failed to add";
		}
		return message;
	}
	@DeleteMapping("/delete/{empid}")
	public void delete(@PathVariable Integer empid) {
		service.deleteEmp(empid);
	}
	@GetMapping("/get/{empid}")
	public Employee get(@PathVariable Integer empid) {
		Employee e2=service.getone(empid);
		return e2;
	}
	@GetMapping("/getAll")
	public List<Employee> getall(){
		List<Employee> list=service.getAll();
		return list;
	}
	@PutMapping("/update/{empid}")
	public Employee update(@RequestBody Employee emp, @PathVariable Integer empid) {
		return service.update(emp,empid);
	}
}
