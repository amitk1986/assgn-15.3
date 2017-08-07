package com.diablo.entity;

import java.util.Date;

public class Student {
int stid;
int marks;
String name;
Date joindate;
public int getStid() {
	return stid;
}
public void setStid(int stid) {
	this.stid = stid;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getJoindate() {
	return joindate;
}
public void setJoindate(Date joindate) {
	this.joindate = joindate;
}
}
