package com.sekhar.model;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class studentreact {
@Id
private Integer sid;
private String name;
private String course;
private Double fee;
public studentreact() {
	super();
}
public studentreact(Integer sid, String name, String course, Double fee) {
	super();
	this.sid = sid;
	this.name = name;
	this.course = course;
	this.fee = fee;
}
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public Double getFee() {
	return fee;
}
public void setFee(Double fee) {
	this.fee = fee;
}
@Override
public String toString() {
	return "studentclass [sid=" + sid + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
}

}
