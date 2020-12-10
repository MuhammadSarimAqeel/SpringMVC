package com.springMVC.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userid")
	private int id ;
	@Column(name="username")
 private String name;
	@Column(name="useremail")
 private String email;
	@Column(name="usermessege")
 private String messege;
 
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMessege() {
	return messege;
}
public void setMessege(String messege) {
	this.messege = messege;
}
public user(String name, String email, String messege) {
	super();
	this.name = name;
	this.email = email;
	this.messege = messege;
}
public user() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "user [name=" + name + ", email=" + email + ", messege=" + messege + "]";
}
  
}
