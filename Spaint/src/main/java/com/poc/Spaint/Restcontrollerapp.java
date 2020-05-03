package com.poc.Spaint;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.Spaint.item.model.Item;

@RestController
@RequestMapping("/cap")
public class Restcontrollerapp {

	@Autowired
	pdservices sdao;

	

	@GetMapping(value = "/get")
	public productproperties save() {

		return sdao.save();

	}

	@PostMapping(value = "/save")
	public String getsave(@RequestBody productproperties porduct) {

		System.out.println("product" + porduct.toString());

		return sdao.save(porduct);

	}

	
	/*
	 * { "id": null, "price": "666", "color": "red", "size": 10, "brand": "rt",
	 * "sku": " sKU", "socks": "abc" }
	 */

}
