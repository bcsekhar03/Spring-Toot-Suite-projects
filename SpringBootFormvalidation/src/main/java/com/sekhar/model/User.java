package com.sekhar.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class User {
	
	@NotEmpty(message="name is required")
	@Size(min=5, max=8, message="name should be 5 to 8 characters")
	private String name;
	
	@NotEmpty(message="Password is required")
	@Size(min=5, max=8, message="Password should be 5 to 8 characters")
	private String pwd;
	
	@NotEmpty(message="Email is required")
	@Email(message="Enter valid Email")
	private String email;
	
	@NotNull(message="Mobile number is required")
	@Size(min=10, max=10, message="mobile Number should be only 10 digits")
	private String mobileNo;
	
	@NotNull(message="Age is required")
	@Min(value=21, message="Age should be minimum 21 years")
	@Max(value=60, message="Age should be not be cross 60 years")
	private Integer age;

	public User() {
		super();
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
}
