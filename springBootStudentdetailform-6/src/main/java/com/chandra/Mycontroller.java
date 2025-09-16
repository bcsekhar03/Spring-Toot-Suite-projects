package com.chandra;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Mycontroller {
	@RequestMapping("/")
	public String home(Model model)
	{
		User user=new User();		
		model.addAttribute("user",user);
		initializeFormvalues(model);
		return "/userreg"; 
	}	
	@RequestMapping("/register")
	public String printRegister(@ModelAttribute User user,ModelMap model )
	{
		model.put("user",user);
		return "/userresult";
	}
	public void initializeFormvalues(Model model) {
		List<String> gender=new ArrayList<>();
        gender.add("Male");
        gender.add("Female");        
        model.addAttribute("gender",gender); 
        
		List<String> qualification=new ArrayList<>();
		qualification.add("ssc");
		qualification.add("inter");
		qualification.add("UG");
		qualification.add("PG");
		model.addAttribute("qualification",qualification);
		
		List<String> course=new ArrayList<>();
		course.add("java");
		course.add("j2EE");
		course.add("hibernate");
		course.add("spring");
        model.addAttribute("course",course);  
        
		List<String> time=new ArrayList<>();
		time.add("Morning");
		time.add("Afternoon");
		time.add("Evening");
        model.addAttribute("time",time);
        
        List<String> city=new ArrayList<>();
        city.add("hyderabad");
        city.add("kurnool");
        city.add("yemmiganur");
        city.add("vizag");
        model.addAttribute("city",city);
        
        List<String> state=new ArrayList<>();
        state.add("A.P");
        state.add("T.S");
        state.add("MH");
        state.add("Up");
        model.addAttribute("state",state);
        
        List<String> country=new ArrayList<>();
        country.add("india");
        country.add("america");
        country.add("russia");
        country.add("japan");
        model.addAttribute("country",country);

	}
	
		
}

