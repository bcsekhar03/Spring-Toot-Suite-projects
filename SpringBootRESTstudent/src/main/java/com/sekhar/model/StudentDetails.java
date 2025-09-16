package com.sekhar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class StudentDetails{
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="sid")
	private int sid;	
	private String name;
	private String course;
	private Double fee;
	
	public StudentDetails() {
		super();
	}
	public StudentDetails(int sid, String name, String course, Double fee) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
		this.fee = fee;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
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
		return "StudentDetails [stdId=" + sid + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}
	

}
