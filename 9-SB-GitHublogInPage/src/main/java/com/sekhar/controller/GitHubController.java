package com.sekhar.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubController {

	@GetMapping("/")
	public String message(Principal principal) {
		return "WelCome "+principal.getName()+". You are Successfully logged in ";
	}
}
