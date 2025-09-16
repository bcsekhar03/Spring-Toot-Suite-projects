package com.sekhar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sekhar.model.User;

import jakarta.validation.Valid;

@Controller
public class UserController {

	@GetMapping("/register")
	public String getForm(Model model) {
		User u=new User();
		model.addAttribute("user", u);
		return "Index";
	}
	@PostMapping("/register")
	public String handleRegisterBtn(@Valid User userForm, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "Index";
		}
		System.out.println(userForm);
		
		//logic to Store data in db
		model.addAttribute("msg","Your Registration Successfull");
		return "success";
	}
}
