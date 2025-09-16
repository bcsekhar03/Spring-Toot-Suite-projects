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

import com.sekhar.Repo.StudentRepo;
import com.sekhar.model.StudentDetails;


@RestController
public class StudentController {
	@Autowired
	private StudentRepo repo;
	
	@PostMapping("/save")	
	public StudentDetails savestudent(@RequestBody StudentDetails stud)
	{
		StudentDetails std=repo.save(stud);
		return std;
	}
	@DeleteMapping("/delete/{sid}")
	public String delete(@PathVariable int sid) {
		repo.deleteById(sid);
		return "Student with id " + sid + " deleted successfully!";
				
	}
	@GetMapping("/get/{sid}")
	public StudentDetails getone(@PathVariable int sid) {
		StudentDetails s1=repo.findById(sid).get();
		return s1; 
	}
	@GetMapping("/getall")
	public List<StudentDetails> getAll(){
		List<StudentDetails> s2=repo.findAll();
		return s2;
	}	
	@PutMapping("/update/{sid}")
	public StudentDetails modify(@RequestBody StudentDetails student, @PathVariable int sid) {
		StudentDetails s3=repo.findById(sid).get();
		s3.setSid(sid);
		s3.setName(student.getName());
		s3.setCourse(student.getCourse());
		s3.setFee(student.getFee());
		return repo.save(s3);
	}

	
}
