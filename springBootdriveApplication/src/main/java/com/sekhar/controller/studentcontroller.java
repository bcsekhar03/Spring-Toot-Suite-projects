package com.sekhar.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sekhar.model.studentreg;
import com.sekhar.repo.studentRepo;

@RestController
public class studentcontroller {
	@Autowired
	private studentRepo repo;
	@PostMapping("/save")
	public studentreg saveStudent(@RequestBody studentreg stud)
	{
		studentreg s=new studentreg();
		repo.save(stud);
		return s;
	}
	@DeleteMapping("/delete{id}")
	public void deleteStudent(@PathVariable int id) {
		repo.deleteById(id);
	}
	@GetMapping("/getAll")
	public Iterable<studentreg> getAll()
	{
	  Iterable<studentreg> stud=repo.findAll();
		return stud;
		
	}

}
