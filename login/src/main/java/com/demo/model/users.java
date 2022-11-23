package com.demo.model;

public class users {
   String name;
   String userName;
   String password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public users(String name, String userName, String password) {
	super();
	this.name = name;
	this.userName = userName;
	this.password = password;
}
public users() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "users [name=" + name + ", userName=" + userName + ", password=" + password + "]";
}
   
}
