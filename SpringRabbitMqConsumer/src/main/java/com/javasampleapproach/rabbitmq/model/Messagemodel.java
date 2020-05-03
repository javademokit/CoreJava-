package com.javasampleapproach.rabbitmq.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="message")
public class Messagemodel {
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	@Column(name="ordername")
	private String ordername;
	@Column(name="contact_details")
	private String contact_details;
	@Column(name="food_name")
	private String food_name;
	@Column(name="no_of_item")
	private String no_of_item;
	@Column(name="total_amount")
	private int total_amount;
	@Column(name="paymentmode")
	private String paymentmode;
	@Column(name="order_id")
	private int order_id;
	@Column(name="order_date")
	private Date order_date;
	public Messagemodel(long id, String address, String email, String ordername, String contact_details,
			String food_name, String no_of_item, int total_amount, String paymentmode, int order_id, Date order_date) {
		super();
		this.id = id;
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
	public Messagemodel() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Messagemodel [id=" + id + ", address=" + address + ", email=" + email + ", ordername=" + ordername
				+ ", contact_details=" + contact_details + ", food_name=" + food_name + ", no_of_item=" + no_of_item
				+ ", total_amount=" + total_amount + ", paymentmode=" + paymentmode + ", order_id=" + order_id
				+ ", order_date=" + order_date + "]";
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
