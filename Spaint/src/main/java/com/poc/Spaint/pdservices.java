package com.poc.Spaint;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class pdservices {
	
	 @Autowired
	 ProductDao dao;
	
	 
	public  productproperties save()
	{
		productproperties s=new productproperties("abc", "666", "red", 10, "rt", " sKU");
		
		
		return s;
		

	}
	
	public String save(productproperties obje)
	{
		dao.save(obje);
		
		return "record has saved ";
		
	}
	
	/*
	public List<productproperties> getlist()
	{
		
		return dao.findAll();
	}*/
	 
}
