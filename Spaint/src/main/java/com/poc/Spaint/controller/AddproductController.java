package com.poc.Spaint.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.Spaint.productproperties;
import com.poc.Spaint.item.model.Item;
import com.poc.Spaint.services.AddItemCatalog;

@RestController
@RequestMapping("/catalog")
public class AddproductController {

	@Autowired
	AddItemCatalog additem;

	// creating duumy data base
	@GetMapping(value = "/add")
	public Item dummyobject() {
		return additem.save();
	}
	// geting all the record from bacend database
	@GetMapping(value = "/db")
	public List<Item> databaserecord() {
		return additem.checitm();
	}
	// saving data into oracle database
	@PostMapping(value = "/save")
	public String getsave(@RequestBody Item porduct) {
		System.out.println("product" + porduct.toString());
		return additem.Addcatalog(porduct);
	}
	//find by id 
	@GetMapping(value = "/byid/{id}")
	public Optional<Item> findbyid(@PathVariable Long id ){
		return additem.findbyid(id);
	}
	@PutMapping(value="/up/{id}")
	public String update(@RequestBody Item porduct,@PathVariable Long id ){
		
		return additem.update(id, porduct);
	}
	@DeleteMapping(value="/dbyid/{id}")
	public String deletebyid(@PathVariable Long id){
		return additem.deletebyid(id);
	}
	//delete alll
	@DeleteMapping(value="/dell")
	public String delete(@PathVariable Long id){
		return additem.deletebyid(id);
	}
	//count 
	@GetMapping(value="/c")
	public long getcount()
	{
	return additem.getcount();
	}
	

}
