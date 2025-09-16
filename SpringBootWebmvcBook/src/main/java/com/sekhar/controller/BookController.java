package com.sekhar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sekhar.model.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getbookData(Model model) {
		Book b=new Book(101,"Spring",600.00);
		model.addAttribute("book", b);
		return "book";
	}
}
