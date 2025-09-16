package com.sekhar.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class customesecirity extends WebSecurityConfigurerAdapter{

	protected void configure(HttpSecurity http)throws Exception
	{
		http.authorizeRequests()		
		.antMatchers("/home").permitAll()
		.antMatchers("/contact").permitAll()
		.antMatchers("/balance").authenticated()
		.antMatchers("/loan").authenticated()
		.antMatchers("/statement").authenticated()

		.and().formLogin();
		//http.httpBasic();
		
	}
}
