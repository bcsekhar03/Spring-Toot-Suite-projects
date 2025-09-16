package com.sekhar.model;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class user {
@Id
private int id;
private String name;
//pdc+psm+pgm+toString()
public user() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "user [id=" + id + ", name=" + name + "]";
}

}
