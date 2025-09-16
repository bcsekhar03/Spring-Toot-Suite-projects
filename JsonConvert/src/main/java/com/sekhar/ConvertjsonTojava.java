package com.sekhar;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertjsonTojava {

	public static void main(String[] args) throws Exception {

		File json=new File("books.json");
		ObjectMapper map=new ObjectMapper();
		Book b=map.readValue(json,Book.class); 
		System.out.println(b);
	}

}
