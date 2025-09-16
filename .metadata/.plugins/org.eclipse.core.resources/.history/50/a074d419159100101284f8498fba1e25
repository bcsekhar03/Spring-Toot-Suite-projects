package com.sekhar.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sekhar.error.NoDataFound;

@RestController
public class BookController {

	@GetMapping("/price/{isbn}")
	public String getPrice(@PathVariable String isbn)
	{
		String msg="";
		if(isbn.equals("ISBN001"))
		{
			msg="Book price is : 300$";
		}else {
			throw new NoDataFound("Invalid ISBN");
		}
		return msg;
	}
}
