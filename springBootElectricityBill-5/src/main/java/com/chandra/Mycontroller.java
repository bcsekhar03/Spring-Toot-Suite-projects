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
		return "Bill";
	}
	@RequestMapping("/req1")
	public String printinvoice(@RequestParam int cid,@RequestParam String cname,@RequestParam int crd,@RequestParam int prd,ModelMap m)
	{
		m.put("k1","customer Id="+cid);
		m.put("k2","customer Name="+cname);
		m.put("k3","Current Reading="+crd);
		m.put("k4","Previous Reading="+prd);
		
		double units=crd-prd;
		m.put("k5","Units="+units);
		double titalbill=0.0;
		if(units<200)
			titalbill=units*1.75;			
		else if(units>=200&&units<=500)
			titalbill=units*3.75;
		else if(units>=500)
			titalbill=units*7.25;
		m.put("k6","TOTALBILL="+titalbill);
		return "result";
	}
}

