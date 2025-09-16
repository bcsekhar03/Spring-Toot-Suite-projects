package com.sekhar.bind;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeApi {
	
	@GetMapping("/")
	public String welcome() {
		String msg="Welcome to our new world...!!!";
		return msg;
	}

}
