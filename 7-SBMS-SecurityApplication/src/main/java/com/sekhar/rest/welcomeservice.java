package com.sekhar.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class welcomeservice {

	private String apiurl="http://localhost:8080/";
	
	public void invokeWelcomeapi() {
		//using rest template to print message
		
		RestTemplate rt=new RestTemplate();
		HttpHeaders headers=new HttpHeaders();
		headers.setBasicAuth("chandra","bcs@123");
		HttpEntity<String> req=new HttpEntity<>(headers);
		ResponseEntity<String> resp=rt.exchange(apiurl, HttpMethod.GET, req, String.class);
		String body=resp.getBody();
		System.out.println(body);
	}
	public void invokeWelcomeapi1() {
		WebClient web=WebClient.create();
		String block=web.get()
				              .uri(apiurl)
				              .headers(headers->headers.setBasicAuth("chandra","bcs@123"))
				              .retrieve()
				              .bodyToMono(String.class)
				              .block();
		System.out.println(block);
	}
}
