package com.sekhar.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class securityconfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource datasource;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	
	protected void configur(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests()
		.antMatchers("/home").permitAll()
		.antMatchers("/welcome").authenticated()
		.antMatchers("/admin").hasAuthority("ADMIN_ROLE")
		.antMatchers("/emp").hasAuthority("EMPLOYEE_ROLE")
		.antMatchers("/mgr").hasAuthority("MANAGER_ROLE")
		.antMatchers("/common").hasAnyAuthority("EMPLOYEE_ROLE","MANAGER_ROLE")
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.defaultSuccessUrl("/welcome",true)
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.and()
		.exceptionHandling()
		.accessDeniedPage("/accessDenied");
	}
}
