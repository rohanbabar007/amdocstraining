package com.training.amdocs.covidapi.pojo;

import org.springframework.stereotype.Component;

@Component
public class Centre {
  private int id;
  private String name;
  private String pincode;
  public Centre() {
	// TODO Auto-generated constructor stub
}
  
public Centre(int id, String name, String pincode) {
	
	this.id = id;
	this.name = name;
	this.pincode = pincode;
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
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Centre = name : " + name + " , pincode : " + pincode ;
}
  
}
