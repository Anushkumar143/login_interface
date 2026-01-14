package com.model;

public class Usermodel
{
	String username;
	String password;
	String firstname;
	String lastname;
	String dob;
	String email;
	String phone;

	public String getusername() {	return username;	}
	public String getpassword() { return password; }
	public String getfirstname() {	return firstname;	}
	public String getlastname() {return lastname;}
	public String getdob() {return dob;}
	public String getemail() {	return email;	}
	public String getphone() {	return phone;	}
	public void setusername(String username) {	this.username = username;	}
	public void setpassword(String password) {	this.password = password;	}
	public void setfirstname(String firstname) {	this.firstname = firstname;	}
	public void setlastname(String lastname) {this.lastname = lastname;}
	public void setdob(String dob) {this.dob = dob;}
	public void setemail(String email) {	this.email = email;	}
	public void setphone(String phone) {	this.phone = phone;	}
}
