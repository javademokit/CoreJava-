package com.poc.Spaint;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="productproperties1")
public class productproperties {
	
	 @Id
	    @GeneratedValue(generator = "uuid")
	    @GenericGenerator(name = "uuid", strategy = "uuid2")
	    private String id;
   
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	@Column(name="sock")
	private  String Socks;
	@Column(name="price")
	private String price;
	@Column(name="color")
	private String  color;
	@Column(name="psize")
	private int size;
	@Column(name="brand")
	private String brand;
	@Column(name="SKU")
	private String SKU;


public productproperties()
{
	
}



	public productproperties(String socks, String price, String color, int size, String brand, String sKU) {
		
		Socks = socks;
		this.price = price;
		this.color = color;
		this.size = size;
		this.brand = brand;
		SKU = sKU;
	}
	
	public String getSocks() {
		return Socks;
	}


	public void setSocks(String socks) {
		Socks = socks;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getSKU() {
		return SKU;
	}


	public void setSKU(String sKU) {
		SKU = sKU;
	}



	@Override
	public String toString() {
		return "productproperties [Socks=" + Socks + ", price=" + price + ", color=" + color + ", size=" + size
				+ ", brand=" + brand + ", SKU=" + SKU + "]";
	}



	
	
}
