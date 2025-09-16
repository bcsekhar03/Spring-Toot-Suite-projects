package com.sekhar.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

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
		.and()
		.formLogin();
		http.httpBasic();
	}
	
		protected void configure(AuthenticationManagerBuilder http) throws Exception 
		{
			http.inMemoryAuthentication()
			.withUser("chandra").password("bcs456").authorities("admin").and()
			.withUser("kalyan").password("k1234").authorities("USER").and()
		    .withUser("veera").password("veera321").authorities("USER").and()
			.passwordEncoder(NoOpPasswordEncoder.getInstance());
		}
	
	
	}

	

