package com.sekhar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootWebmvcBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebmvcBookApplication.class, args);
	}

}
