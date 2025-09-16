package com.sekhar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMarshallingApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootMarshallingApplication.class, args);
		
		Address add=new Address();
		add.setCity("Bangalore");
		add.setState("karnataka");
		add.setCountry("India");
		
		person p=new person();
		p.setId(10);
		p.setName("sekhar");
		p.setAge(23);
		p.setPhno("9634561234");
		p.setAddress("addr");
	}

}
