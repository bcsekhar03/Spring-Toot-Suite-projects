package com.sekhar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sekhar.model.studentclass;
import com.sekhar.repo.studentRepo;


@Controller
public class studentcontroller {
	@Autowired
private studentRepo studrepo;
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
@RequestMapping("/reg")

	public String register() {
	
	return "regform";
}

@RequestMapping(value="/form",method=RequestMethod.POST)
public String storevalues(@RequestParam Integer sid,
		@RequestParam String fname,
		@RequestParam String lname,
		@RequestParam Integer sub1,
		@RequestParam Integer sub2,
		@RequestParam Integer sub3,
		studentclass stud,Model model)
{
	String fullname=fname+lname;
stud.setFullname(fname+lname);
	int total=0;
	Double percentage=0.0;
	String Grade="";
	total=stud.getSub1()+stud.getSub2()+stud.getSub3();   
	stud.setTotal(total);
	percentage=(double) (stud.getTotal()/3);
	stud.setPercentage(percentage);

if(percentage>=70)
	{		
	Grade="grade A";	
	}
else if(percentage>=60&&percentage<70)
	{
	Grade="grade B";
	}
else if(percentage>=50&&percentage<60)
{
Grade="grade C";
}
else {
	Grade="fail";
		
}
stud.setGrade(Grade);	
studrepo.save(stud);
	
	return "viewdetails";
}
@RequestMapping(value="/viewrelt",method=RequestMethod.GET)
public String viewvalues(Model model)
{
model.addAttribute("stds",studrepo.findAll());
return "/viewdetails";
}
@RequestMapping(value="/delete/{sid}",method=RequestMethod.GET)
public String delete(@PathVariable Integer sid)
{
	studrepo.deleteById(sid);
	return "/viewdetails";
}
@RequestMapping(value="/edit/{sid}",method=RequestMethod.GET)
public String update(@PathVariable Integer sid,Model model)
{
	studentclass stud=studrepo.findById(sid).get();
	model.addAttribute("command",stud);
	return "updatedetails";	
}
@RequestMapping(value="/update",method=RequestMethod.POST)
public String storevalues1 (@RequestParam Integer sid,
		@RequestParam String fullname,
		@RequestParam Integer sub1,
		@RequestParam Integer sub2,
		@RequestParam Integer sub3,
		studentclass stud,Model model)
{
	int total=0;
	Double percentage=0.0;
	String Grade="";
	total=stud.getSub1()+stud.getSub2()+stud.getSub3();   
	stud.setTotal(total);
	percentage=(double) (stud.getTotal()/3);
	stud.setPercentage(percentage);

if(percentage>=70)
	{		
	Grade="grade A";	
	}
else if(percentage>=60&&percentage<70)
	{
	Grade="grade B";
	}
else if(percentage>=50&&percentage<60)
{
Grade="grade C";
}
else {
	Grade="fail";
		
}
stud.setGrade(Grade);	
studrepo.save(stud);
	
	return "viewdetails";
}
}
