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
		return "vote";
	}
	@RequestMapping("/req2")
	public String check(@RequestParam Integer uage, ModelMap m)
	{
		m.put("k1",uage);
		String vote="";
		if(uage>=18)
		{
			vote="valid for voting";
		}
		else
		{
			vote="not eligible for voting";
		}
		m.put("k2",vote);
		return "result";
	}
}

