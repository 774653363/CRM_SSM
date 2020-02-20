package ek.zhou.pojo;


import java.util.HashSet;
import java.util.Set;

public class Customer {
private int  cust_id;
private String cust_name;
private Dictionary cust_source;
private Dictionary cust_industry;
private Dictionary cust_level;
private String cust_linkman;
private String cust_image;
private String cust_phone;
private String cust_mobile;
public Customer() {
	// TODO Auto-generated constructor stub
}
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public String getCust_name() {
	return cust_name;
}
public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}
public Dictionary getCust_source() {
	return cust_source;
}
public void setCust_source(Dictionary cust_source) {
	this.cust_source = cust_source;
}
public Dictionary getCust_industry() {
	return cust_industry;
}
public void setCust_industry(Dictionary cust_industry) {
	this.cust_industry = cust_industry;
}
public Dictionary getCust_level() {
	return cust_level;
}
public void setCust_level(Dictionary cust_level) {
	this.cust_level = cust_level;
}
public String getCust_linkman() {
	return cust_linkman;
}
public void setCust_linkman(String cust_linkman) {
	this.cust_linkman = cust_linkman;
}
public String getCust_image() {
	return cust_image;
}
public void setCust_image(String cust_image) {
	this.cust_image = cust_image;
}
public String getCust_phone() {
	return cust_phone;
}
public void setCust_phone(String cust_phone) {
	this.cust_phone = cust_phone;
}
public String getCust_mobile() {
	return cust_mobile;
}
public void setCust_mobile(String cust_mobile) {
	this.cust_mobile = cust_mobile;
}


@Override
public String toString() {
	return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_user_id=" 
			+ ", cust_create_id=" + ", cust_source=" + cust_source + ", cust_industry=" + cust_industry
			+ ", cust_level=" + cust_level + ", cust_linkman=" + cust_linkman + ", cust_image=" + cust_image
			+ ", cust_phone=" + cust_phone + ", cust_mobile=" + cust_mobile + "]";
}



}
