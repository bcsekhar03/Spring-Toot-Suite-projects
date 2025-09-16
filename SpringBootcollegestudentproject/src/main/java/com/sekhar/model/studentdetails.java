package com.sekhar.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Studentdetails")
public class studentdetails {

private long sid;
private String name;
private String email;
private String course;
private int year;
public studentdetails() {
		super();
}
public studentdetails(long sid, String name, String email, String course,int year) {
		super();
	this.sid = sid;
	this.name = name;
	this.email= email;
	this.course = course;
	this.year = year;
}
public long getSid() {
	return sid;
}
public void setSid(long sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail () {
	return email;
}
public void setEmail (String email) {
	this.email = email;	
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return "studentclass [sid=" + sid + ", name=" + name + ", email=" + email + ", course=" + course + ", year=" + year + "]";
}

}
