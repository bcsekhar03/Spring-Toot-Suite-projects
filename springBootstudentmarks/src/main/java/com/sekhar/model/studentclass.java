package com.sekhar.model;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class studentclass {
@Id
private Integer sid;
private String fullname;
private Integer sub1;
private Integer sub2;
private Integer sub3;
private Integer total;
private Double percentage;
private String grade;
public studentclass() {
	super();
}
public studentclass(Integer sid, String fullname, Integer sub1, Integer sub2, Integer sub3, Integer total,
		Double percentage, String grade) {
	super();
	this.sid = sid;
	fullname = fullname;
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3;
	this.total = total;
	this.percentage = percentage;
	this.grade = grade;
}
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public Integer getSub1() {
	return sub1;
}
public void setSub1(Integer sub1) {
	this.sub1 = sub1;
}
public Integer getSub2() {
	return sub2;
}
public void setSub2(Integer sub2) {
	this.sub2 = sub2;
}
public Integer getSub3() {
	return sub3;
}
public void setSub3(Integer sub3) {
	this.sub3 = sub3;
}
public Integer getTotal() {
	return total;
}
public void setTotal(Integer total) {
	this.total = total;
}
public Double getPercentage() {
	return percentage;
}
public void setPercentage(Double percentage) {
	this.percentage = percentage;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
@Override
public String toString() {
	return "studentclass [sid=" + sid + ", Fullname=" + fullname + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3="
			+ sub3 + ", total=" + total + ", percentage=" + percentage + ", grade=" + grade + "]";
}

}
