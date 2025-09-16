package com.chandra;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class Mycontroller {
	@GetMapping("/")
	public String home(Model model)
	{
		User user=new User();		
		model.addAttribute("user",user);
		initializeFormvalues(model);
		return "userreg"; 
	}	
	@PostMapping("/register")
	public String printRegister(@ModelAttribute("user") User user, ModelMap model) {
	    System.out.println("Form submitted: " + user);
	    model.put("user", user);
	    return "userresult";
	}

	public void initializeFormvalues(Model model) {
		List<String> courses=new ArrayList<String>();
		courses.add("java");
		courses.add("j2EE");
		courses.add("hibernate");
		courses.add("spring");
        model.addAttribute("courses",courses); 
        
		List<String> genders=new ArrayList<String>();
        genders.add("Male");
        genders.add("Female");        
        model.addAttribute("genders",genders); 
        
		List<String> batches=new ArrayList<String>();
        batches.add("Morning");
        batches.add("Evening");
        model.addAttribute("batches",batches);

	}
	
		
}

