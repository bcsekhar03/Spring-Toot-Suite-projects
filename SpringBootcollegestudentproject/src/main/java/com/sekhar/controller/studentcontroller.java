package com.sekhar.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sekhar.model.studentdetails;
import com.sekhar.repo.studentRepo;


@RestController
public class studentcontroller {
	@Autowired
private studentRepo studrepo;
	@RequestMapping("/Studentdetails")
	public String home()
	{
		return "home";
	}
	
@RequestMapping("/reg")

	public String register() {
	
	return "regform";
}
 
    // Here connected to the POSTMAN tool

@PostMapping("/save")

	public String saveStud(@RequestBody studentdetails stud)
	{
	studentdetails std=studrepo.save(stud);
	String message=null;
	if(std!=null)
	{
		message="Student Data Successfully Inserted Into Database";
	}
	else {
		message="Data Inserted Failed";
		}
	return message;
}
 // Getting All Student Values

@GetMapping({"value","/getAll"})
public List <studentdetails> getStudentdetails()
{ 
    return (List<studentdetails>) studrepo.findAll();
}
  //Getting One preferred Student Value

 @GetMapping("get/{sid}")
public studentdetails getonerecord(@PathVariable int sid)
{
	studentdetails stds=studrepo.findById(sid).get();
	 return stds;
}
  // Updating the Student Value

 @PutMapping({"edit","/sid"})
public String updateStudentdetails(@PathVariable int sid,@RequestBody studentdetails stud)
{
	 studentdetails update=studrepo.findById(sid).get();
	 studentdetails studentdetails = new studentdetails();
	 studentdetails.setName(studentdetails.getName());
	 update.setEmail(studentdetails.getEmail());
	 update.setCourse(studentdetails.getCourse());
	 update.setYear(studentdetails.getYear());
	 studrepo.save(update);
	 
	 return "Updated successfully...!";
}
}

