package com.chandra;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Mycontroller {

	@RequestMapping("/")
	public String home()
	{
		return "userreg";
	}
	@RequestMapping("/req2")
	public String printinvoice(@RequestParam int eid,@RequestParam String name,@RequestParam String mail,@RequestParam String addr,@RequestParam Long mbl,@RequestParam double sal,ModelMap m)
	{
		m.put("k1","Employee Id="+eid);
		m.put("k2","Name="+name);
		m.put("k3","Email="+mail);
		m.put("k4","Address="+addr);
		m.put("k5","Mobile Number="+mbl);
		m.put("k6","Basic salary="+sal);
		double salary=sal;
		double ta=0.0,da,pf=0.0;		
		if(salary<30000)
		ta=(salary/100)*10;	
		m.put("k7","ta="+ta);
		da=(salary/100)*12;
		m.put("k8","da="+da);
		pf=(salary/100)*15;
		m.put("k9","pf="+pf);
		if(salary>=30000&&salary<50000)
		ta=(salary/100)*12;	
		m.put("k7","ta="+ta);
		da=(salary/100)*17;
		m.put("k8","da="+da);
		pf=(salary/100)*21;
		m.put("k9","pf="+pf);
		if(salary>=50000)
		ta=(salary/100)*15;	
		m.put("k7","ta="+ta);
		da=(salary/100)*21;
		m.put("k8","da="+da);
		pf=(salary/100)*27;
		m.put("k9","pf="+pf);
		double gross_salary,net_salary=0.0;
		gross_salary=salary+ta+da+pf;
		m.put("k10","Gross_salary="+gross_salary);
		net_salary=gross_salary-pf;
		m.put("k11","Net_salary="+net_salary);
		return "userresult";
	}
}

