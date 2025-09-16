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
		return "number";
	}
	@RequestMapping("/req2")
	public String check(@RequestParam int unumber, ModelMap m)
	{
		String num="";
		if(unumber%2==0)
		num="even";
		else
		num="odd";
		m.put("k1", num);
		return "result";
	}
}

