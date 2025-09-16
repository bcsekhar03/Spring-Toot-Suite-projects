package com.chandra;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class student10 {
@Id
@Column(name="sid")
private int stdid;
@Column(name="name")
private String stdname;
@Column (name="course")
private String stdcourse;
private double fee;
public student10() {
	super();
}
public student10(int stdid, String stdname, String stdcourse, double fee) {
	super();
	this.stdid = stdid;
	this.stdname = stdname;
	this.stdcourse = stdcourse;
	this.fee = fee;
}
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public String getStdname() {
	return stdname;
}
public void setStdname(String stdname) {
	this.stdname = stdname;
}
public String getStdcourse() {
	return stdcourse;
}
public void setStdcourse(String stdcourse) {
	this.stdcourse = stdcourse;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
@Override
public String toString() {
	return "student [stdid=" + stdid + ", stdname=" + stdname + ", stdcourse=" + stdcourse + ", fee=" + fee + "]";
}

}
