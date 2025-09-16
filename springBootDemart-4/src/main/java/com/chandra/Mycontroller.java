package com.chandra;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {

	@RequestMapping("/")
	public String home() {
		return "custo";
	}
	@RequestMapping("/req2")
	public String printinvoice(@RequestParam int cid, @RequestParam String cname, @RequestParam long mbl,
			@RequestParam double price, @RequestParam int qty, ModelMap m) {
		m.put("k1", "customer Id=" + cid);
		m.put("k2", "customer Name=" + cname);
		m.put("k3", "Mobile NO=" + mbl);
		m.put("k4", "price=" + price);
		m.put("k5", "Quantity=" + qty);
		double total = price * qty;
		m.put("k6", "total=" + total);
		double discount = 0.0;
		if (total < 2000)
			discount = (total / 100) * 10;
		else if (total >= 2000 && total < 5000)
			discount = (total / 100) * 15;
		else if (total >= 5000)
			discount = (total / 100) * 25;
		double GST = (total / 100) * 18;
		m.put("k7", "Discount=" + discount);
		m.put("k8", "GST=" + GST);
		double totalbill = total + GST-discount;
		m.put("k9", "TOTALBILL=" + totalbill);
		return "result";
	}
}
