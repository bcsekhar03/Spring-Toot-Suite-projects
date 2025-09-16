package com.chandra;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class employeecrud {
@Id
private int empId;
private String empName;
private String email;
private String password;
private String gender;
private String addr;
private long MobileNo;
private String companyName;
private String designation;
public employeecrud() {
	super();
}
public employeecrud(int empId, String empName, String email, String password, String gender, String addr, long mobileNo,
		String companyName, String designation) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.email = email;
	this.password = password;
	this.gender = gender;
	this.addr = addr;
	MobileNo = mobileNo;
	this.companyName = companyName;
	this.designation = designation;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public long getMobileNo() {
	return MobileNo;
}
public void setMobileNo(long mobileNo) {
	MobileNo = mobileNo;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
@Override
public String toString() {
	return "employeecrud [empId=" + empId + ", empName=" + empName + ", email=" + email + ", password=" + password
			+ ", gender=" + gender + ", addr=" + addr + ", MobileNo=" + MobileNo + ", companyName=" + companyName
			+ ", designation=" + designation + "]";
}

}

