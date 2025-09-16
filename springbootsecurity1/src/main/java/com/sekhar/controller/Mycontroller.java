package com.sekhar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
@GetMapping("/home")
public String home()
{
	return("Welcome to homepage");
}
@GetMapping("/balance")
public String balance()
{
	return("My Account balance is 25000.00 INR");
}
@GetMapping("/loan")
public String loan()
{
	return("your loan amount is 500000.00 INR");
}
@GetMapping("/statement")
public String stmt()
{
	return("statement generated sent to your mail id");
}
@GetMapping("/contact")
public String contact()
{
	return ("Thank you for contacting us we will get back to you");
}
}
