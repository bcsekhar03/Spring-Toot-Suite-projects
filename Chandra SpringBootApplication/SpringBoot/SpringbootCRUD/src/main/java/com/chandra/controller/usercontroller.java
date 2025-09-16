package com.chandra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chandra.model.user;
import com.chandra.repo.userRepo;

import ch.qos.logback.core.model.Model;

@Controller
public class usercontroller {
	
	@Autowired
	private userRepo repo;
	

	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/req1")
	public String regHome()
	{
		return "reg";
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String saveUser(@RequestParam int id,
			@RequestParam String name,
			@RequestParam String password,
			@RequestParam String email,
			@RequestParam String gender,
			@RequestParam String country,user user,Model model)
	{
		
		repo.save(user);
		return "sucess";
	}
	
	 /* It provides list of Users in model object */    
    /*@RequestMapping(value="/views",method=RequestMethod.GET)    
    public String viewAllUser(Model model){    
        model.addAttribute("users",repo.findAll());
        return "viewUser";   
    } 
    
    @RequestMapping(value="/delete/{id}",
    		method=RequestMethod.GET)
    public String deleteUser(@PathVariable int id)
    {
    	repo.deleteById(id);
    	 return "redirect:/viewUser"; 
    }*/
    
}
