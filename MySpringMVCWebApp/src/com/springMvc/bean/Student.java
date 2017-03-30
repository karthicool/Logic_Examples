package com.springMvc.bean;

import java.util.Date;

public class Student {
private String uname;
private String pwd;
private String cmpny;
private Date date;
private Long mobile;
private Address studAddress;

public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getCmpny() {
	return cmpny;
}
public void setCmpny(String cmpny) {
	this.cmpny = cmpny;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
public Address getStudAddress() {
	return studAddress;
}
public void setStudAddress(Address studAddress) {
	this.studAddress = studAddress;
}
}
