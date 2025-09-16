package com.chandra;

import java.util.List;

public class User {
private String uname;
private String email;
private String gender;
private String password;
private String confirmpassword;
private List<String> course;
private List<String> batch;
public User() {
	super();
}
public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmpassword() {
	return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}
public List<String> getCourse() {
	return course;
}
public void setCourse(List<String> course) {
	this.course = course;
}
public List<String> getBatch() {
	return batch;
}
public void setBatch(List<String> batch) {
	this.batch = batch;
}
@Override
public String toString() {
	return "user [name=" + uname + ", email=" + email + ", gender=" + gender + ", password=" + password
			+ ", confirmpassword=" + confirmpassword + ", course=" + course + ", batches=" + batch+"]";
}


}
