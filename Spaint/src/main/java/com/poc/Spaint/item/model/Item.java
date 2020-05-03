package com.poc.Spaint.item.model;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "Itembags1")
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	 private Long id;
	@Column(name = "itm_name")
	private String itm_name;
	@Column(name = "deatils")
	private String deatils;
	@Column(name = "Itm_color")
	private String Itm_color;
	@Column(name = "price")
	private int price;
	@Column(name = "use_deatils")
	private String use_deatils;
	@Column(name = "discount")
	private String discount;
	@Column(name = "Avialable")
	private String Avialable;
	@Column(name = "item_size")
	private String size;
	@Column(name = "Brandname")

	private String Brandname;
	

	public Item() {

	}

	public Item(String itm_name, String deatils, String Itm_color, int price, String use_deatils, String discount,
			String Avialable, String size, String Brandname) {
		super();
		this.itm_name = itm_name;
		this.deatils = deatils;
		this.Itm_color = Itm_color;
		this.price = price;
		this.use_deatils = use_deatils;
		this.discount = discount;
		this.Avialable = Avialable;
		this.size = size;
		this.Brandname = Brandname;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getItm_name() {
		return itm_name;
	}


	public void setItm_name(String itm_name) {
		this.itm_name = itm_name;
	}


	public String getDeatils() {
		return deatils;
	}


	public void setDeatils(String deatils) {
		this.deatils = deatils;
	}


	public String getItm_color() {
		return Itm_color;
	}


	public void setItm_color(String itm_color) {
		Itm_color = itm_color;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getUse_deatils() {
		return use_deatils;
	}


	public void setUse_deatils(String use_deatils) {
		this.use_deatils = use_deatils;
	}


	public String getDiscount() {
		return discount;
	}


	public void setDiscount(String discount) {
		this.discount = discount;
	}


	public String getAvialable() {
		return Avialable;
	}


	public void setAvialable(String avialable) {
		Avialable = avialable;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getBrandname() {
		return Brandname;
	}


	public void setBrandname(String brandname) {
		Brandname = brandname;
	}



	@Override
	public String toString() {
		return "Item [id=" + id + ", itm_name=" + itm_name + ", deatils=" + deatils + ", Itm_color=" + Itm_color
				+ ", price=" + price + ", use_deatils=" + use_deatils + ", discount=" + discount + ", Avialable="
				+ Avialable + ", size=" + size + ", Brandname=" + Brandname + "]";
	}
	

	
}
