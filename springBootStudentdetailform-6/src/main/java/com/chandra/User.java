package com.chandra;

import java.util.List;

public class User {
private String name;
private String mail;
private String password;
private String dob;
private List<String> gender;
private Long mbl;
private List<String> qualification;
private String course;
private List<String> time;
private String addr;
private List<String> city;
private List<String> state;
private List<String> country;

public User() {
	super();
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public List<String> getGender() {
	return gender;
}

public void setGender(List<String> gender) {
	this.gender = gender;
}

public Long getMbl() {
	return mbl;
}

public void setMbl(Long mbl) {
	this.mbl = mbl;
}

public List<String> getQualification() {
	return qualification;
}

public void setQualification(List<String> qualification) {
	this.qualification = qualification;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public List<String> getTime() {
	return time;
}

public void setTime(List<String> time) {
	this.time = time;
}

public String getAddr() {
	return addr;
}

public void setAddr(String addr) {
	this.addr = addr;
}

public List<String> getCity() {
	return city;
}

public void setCity(List<String> city) {
	this.city = city;
}

public List<String> getState() {
	return state;
}

public void setState(List<String> state) {
	this.state = state;
}

public List<String> getCountry() {
	return country;
}

public void setCountry(List<String> country) {
	this.country = country;
}

@Override
public String toString() {
	return "User [name=" + name + ", mail=" + mail + ", password=" + password + ", dob=" + dob + ", gender=" + gender
			+ ", mbl=" + mbl + ", qualification=" + qualification + ", course=" + course + ", time=" + time + ", addr="
			+ addr + ", city=" + city + ", state=" + state + ", country=" + country + "]";
}




}
