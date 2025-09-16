package com.chandra;

import java.util.List;

public class User {
private int eid;
private String name;
private String email;
private String Address;
private Long MobileNo;
private double salary;
public User() {
	super();
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public Long getMobileNo() {
	return MobileNo;
}
public void setMobileNo(Long mobileNo) {
	MobileNo = mobileNo;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "User [eid=" + eid + ", name=" + name + ", email=" + email + ", Address=" + Address + ", MobileNo="
			+ MobileNo + ", salary=" + salary + "]";
}



}
