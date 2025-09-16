package com.sekhar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sekhar.model.Customer;
import com.sekhar.model.Login;
import com.sekhar.service.loginserviceIMP;

@Controller
public class Customercontroller {

	@Autowired
	private loginserviceIMP service;
	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}
	@RequestMapping("/add")
	public String regForm(Model model)
	{
		Customer customer=new Customer();
		model.addAttribute("customer",customer);
		return "reg";
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String addForm(@ModelAttribute Customer customer,Model model)
	{
		Customer cus=service.saveCustomer(customer);
		return "sucess";
	}
	@RequestMapping("/loginform")
	public String loginForm(Model model)
	{
		Login log=new Login();
		model.addAttribute("log",log);
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String addForm(@ModelAttribute Login log,Model model)
	{
		Customer logs=service.login(log.getCname(),log.getPassword());
		String message=null;
		if(logs!=null)
		{
			message="Your Logined Successfully";
		}
		else {
			message="redirect:/log";
		}
		model.addAttribute("message",message);
		return "loginsucess";
	}
}
