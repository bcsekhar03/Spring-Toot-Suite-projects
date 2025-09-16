package com.sekhar;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class person {

	private Integer id;
	private String name;
	private Integer age;
	private Long phno;
	private Address addr;
}
