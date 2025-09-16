package com.sekhar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sekhar.model.studentreact;
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
		@RequestParam String name,
		@RequestParam String course,
		@RequestParam Double fee,
		studentreact stud,Model model)
{
         studrepo.save(stud);
	
	 return "viewdetails";
}
@RequestMapping(value="/views",method=RequestMethod.GET)
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
/*@RequestMapping(value="/edit/{sid}",method=RequestMethod.GET)
public String update(@PathVariable Integer sid,Model model)
{
	studentclass stud=studrepo.findById(sid).get();
	model.addAttribute("command",stud);
	return "updatedetails";	
}	*/
}
