package com.poc.Spaint.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.Spaint.item.model.Item;
import com.poc.Spaint.repository.ItemDao;

@Service
public class AddItemCatalog {

	@Autowired
	ItemDao itmdao;

	// creating dummy object in database
	public Item save() {
		Item s = new Item("pants", "mens", "Mens-shirt", 100, "formal", "10%", "A", "small", "addidas");
		return s;
	}

	public String Addcatalog(Item itm) {
		itmdao.save(itm);
		return "record has add in catalog succesfully...good luck ";
	}

	public List<Item> checitm() {
		return itmdao.findAll();
	}
	public Optional<Item> findbyid(Long id) {
		return itmdao.findById(id);
	}
	public String update(Long id, Item itm) {
		Item customerToUpdate = itmdao.getOne(id);
		customerToUpdate.setAvialable(itm.getAvialable());
		itmdao.save(customerToUpdate);
		itmdao.save(customerToUpdate);
		return "Record updated";
	}
	public String deletebyid(Long id) {
		itmdao.deleteById(id);
		return "Record has deleted";

	}
	public String deleteall() {
		itmdao.deleteAll();
		return "Record has deleted";

	}
	public long getcount()
	{
	return itmdao.count();
	}
	

}
