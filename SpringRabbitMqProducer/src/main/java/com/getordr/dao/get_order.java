package com.getordr.dao;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class get_order {
@NotNull
@Size(min=2, max=30)
private String name;
@NotEmpty(message = "First name is required")
private String address;
@NotEmpty(message = "Email is required")
@Email
private String email;
@NotEmpty(message = "order name is required")
private String ordername;
@NotEmpty(message = "Phone number is required")
@Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",message="Mobile number is invalid")
private String contact_details;
@NotEmpty(message = "food name is required")
private String food_name;
@NotNull
@Min(1)
private String no_of_item;
@NotNull
private int total_amount;
@NotEmpty(message = "paymentmode is required")
private String paymentmode;
@NotNull
@Min(30)
private int order_id;
@NotNull
private Date order_date;

public get_order(String address, String email, String ordername, String contact_details, String food_name,
		String no_of_item, int total_amount, String paymentmode, int order_id, Date order_date) {
	super();
	this.address = address;
	this.email = email;
	this.ordername = ordername;
	this.contact_details = contact_details;
	this.food_name = food_name;
	this.no_of_item = no_of_item;
	this.total_amount = total_amount;
	this.paymentmode = paymentmode;
	this.order_id = order_id;
	this.order_date = order_date;
}
public get_order() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "get_order [address=" + address + ", email=" + email + ", ordername=" + ordername + ", contact_details="
			+ contact_details + ", food_name=" + food_name + ", no_of_item=" + no_of_item + ", total_amount="
			+ total_amount + ", paymentmode=" + paymentmode + ", order_id=" + order_id + ", order_date=" + order_date
			+ "]";
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getOrdername() {
	return ordername;
}
public void setOrdername(String ordername) {
	this.ordername = ordername;
}
public String getContact_details() {
	return contact_details;
}
public void setContact_details(String contact_details) {
	this.contact_details = contact_details;
}
public String getFood_name() {
	return food_name;
}
public void setFood_name(String food_name) {
	this.food_name = food_name;
}
public String getNo_of_item() {
	return no_of_item;
}
public void setNo_of_item(String no_of_item) {
	this.no_of_item = no_of_item;
}
public int getTotal_amount() {
	return total_amount;
}
public void setTotal_amount(int total_amount) {
	this.total_amount = total_amount;
}
public String getPaymentmode() {
	return paymentmode;
}
public void setPaymentmode(String paymentmode) {
	this.paymentmode = paymentmode;
}
public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public Date getOrder_date() {
	return order_date;
}
public void setOrder_date(Date order_date) {
	this.order_date = order_date;
}

}