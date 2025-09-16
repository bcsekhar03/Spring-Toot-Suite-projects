package com.sekhar;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
public class product {

	private Integer pid;
	private String name;
	private Double price;
}
