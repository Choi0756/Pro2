package com.example.demo;

import java.time.LocalDateTime;

public class Member {
private String id;
private String password;
private String name;
private String Birth;
private String phone;
private String Buisnessman;
private String car;

public Member(String id, String password, String name, String Birth, String phone, String Buisnessman, String car) {
    this.id = id;
    this.password = password;
    this.name = name;
    this.phone = phone;
    this.Buisnessman = Buisnessman;
    this.car = car;
    this.Birth = Birth;
}

@Override
public String toString() {
	return "Member [id=" + id + ", password=" + password + ", name=" + name + ", Birth=" + Birth + ", phone=" + phone
			+ ", Buisnessman=" + Buisnessman + ", car=" + car + "]";
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String getBirth() {
	return Birth;
}
public void setBirth(String birth) {
	Birth = birth;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getBuisnessman() {
	return Buisnessman;
}
public void setBuisnessman(String buisnessman) {
	Buisnessman = buisnessman;
}
public String getCar() {
	return car;
}
public void setCar(String car) {
	this.car = car;
}



}