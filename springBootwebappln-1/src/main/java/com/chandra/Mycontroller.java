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
		return "name";
	}
	@RequestMapping("/req2")
	public String Fullname(@RequestParam String fname,@RequestParam String lname,ModelMap m)
	{
		m.put("k1",fname);
		m.put("k2",lname);
		String Fullname=fname+lname;
		m.put("k3",Fullname);
		return "result";
	}
}

