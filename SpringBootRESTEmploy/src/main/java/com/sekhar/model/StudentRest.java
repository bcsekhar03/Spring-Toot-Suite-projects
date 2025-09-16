package com.sekhar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="student_table")
public class StudentRest {
@Id
@Column(name="sid")
private int stdId;
private String name;
private String course;
private double fee;
public StudentRest() {
	super();
}
public StudentRest(int stdId, String name, String course, double fee) {
	super();
	this.stdId = stdId;
	this.name = name;
	this.course = course;
	this.fee = fee;
}
public int getStdId() {
	return stdId;
}
public void setStdId(int stdId) {
	this.stdId = stdId;
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
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
@Override
public String toString() {
	return "student [stdId=" + stdId + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
}



}
