package com.sekhar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sekhar.Repo.StudentRepo1;
import com.sekhar.model.StudentRest;

@RestController
public class studentController {
@Autowired
private StudentRepo1 repo;
@PostMapping("/save")
public StudentRest saveStudent(@RequestBody StudentRest std)
{
	StudentRest s=repo.save(std);
	return s;
}
}
