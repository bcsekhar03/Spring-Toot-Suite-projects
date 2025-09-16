package com.sekhar;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productRest {
    @GetMapping(value="/product", produces= {"application/xml","application/json"})
	public ResponseEntity<product> getproduct(){
		product prod=new product();
		prod.setPid(500);
		prod.setName("keyboard");
		prod.setPrice(1200.00);
		return new ResponseEntity<>(prod, HttpStatus.OK);
	}
	@GetMapping("/products")
	public ResponseEntity<List<product>> getproducts(){
		product p1=new product(201,"mouse",450.00);
		product p2=new product(202,"led",2200.00);
		product p3=new product(203,"cpu",3200.00);
		product p4=new product(204,"cable",600.00);
		List<product> pro=Arrays.asList(p1,p2,p3,p4);
		return new ResponseEntity<>(pro, HttpStatus.OK);
	}
	
}
