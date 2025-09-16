package com.sekhar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sekhar.Repo.PersonalRepo;
import com.sekhar.model.personal;

@Controller
public class PersonalController {
@Autowired
	private PersonalRepo repo;

@RequestMapping("/")
public String home() {
	return "Home";
}
@RequestMapping("/req")
public String regHome() {
	return "userReg";
}
@RequestMapping(value="/register", method=RequestMethod.POST)
public String saveUser(@RequestParam int id,
		@RequestParam String name,
		@RequestParam String password,
		@RequestParam String email,
		@RequestParam String gender,
		@RequestParam String country,personal person,Model model) {
	
	repo.save(person);
	model.addAttribute("msg", "User Registered Successfully");
	return "success";
}
@RequestMapping(value="/viewuser", method=RequestMethod.GET)
public String viewAlluser(Model model) {
	model.addAttribute("user", repo.findAll());
	return "viewuser";
}
@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
public String deleteuser(@PathVariable int id) {
	repo.deleteById(id);
	return "redirect:/viewuser";
}
@RequestMapping(value="/edituser/{id}")
public String updateuser(@PathVariable int id, Model m)
{
	personal user=repo.findById(id).get();
	m.addAttribute("command", user);
	return "edituser";
}
@RequestMapping(value="/editu", method=RequestMethod.POST)
public String editsave(
		@RequestParam String name,
		@RequestParam String password,
		@RequestParam String email,
		@RequestParam String gender,
		@RequestParam String country,personal person,Model model) {
	repo.save(person);
	return "redirect:/viewuser";
	
}
}
