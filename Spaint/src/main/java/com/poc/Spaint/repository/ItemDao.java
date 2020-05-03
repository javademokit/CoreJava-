package com.poc.Spaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.poc.Spaint.productproperties;
import com.poc.Spaint.item.model.Item;
@Repository
public interface ItemDao extends JpaRepository<Item, Long>{
	  

}



