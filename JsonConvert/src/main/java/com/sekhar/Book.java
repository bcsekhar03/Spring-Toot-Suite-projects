package com.sekhar;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({"id","name","price","author"})
public class Book {
	@JsonProperty(value="Book_Id")
	private Integer id;
	private String name;
	private Double price;
	private Author author;
}
