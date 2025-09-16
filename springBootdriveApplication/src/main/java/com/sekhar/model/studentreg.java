package com.sekhar.model;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class studentreg {
@Id
private Integer stdid;
private String name;
private String course;
private Double fee;
public studentreg() {
	super();
}
public studentreg(Integer stdid, String name, String course, Double fee) {
	super();
	this.stdid = stdid;
	this.name = name;
	this.course = course;
	this.fee = fee;
}
public Integer getStdid() {
	return stdid;
}
public void setStdid(Integer stdid) {
	this.stdid = stdid;
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
	return "studentclass [stdid=" + stdid + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
}

}