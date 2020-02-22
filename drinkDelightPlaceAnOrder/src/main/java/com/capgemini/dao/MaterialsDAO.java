package com.capgemini.dao;

import java.util.HashMap;

import com.capgemini.model.MaterialsDetails;

public class MaterialsDAO {

	private static final Integer SupplierId = null; 

	public HashMap<Integer,MaterialsDetails> storeValue(MaterialsDetails a) { // values are stored in hashmap
		//HashMap<Integer,DDbean>
		MaterialsDetails dd=new MaterialsDetails(); // creating reference to bean
	HashMap<Integer,MaterialsDetails> p=new HashMap<Integer,MaterialsDetails>(); // creating hashmap
	p.put(SupplierId,a); // inserting data into hashmap ,for particular supplier ID data containing in a is stored
	//p.put(SupplierId,dd);
//System.out.println(OrderBean.getName());
//System.out.println(OrderBean.getPrice_per_unit());
//System.out.println(OrderBean.getQuanityunit());
//System.out.println(OrderBean.getQuantityValue());
System.out.println("Your order is placed sucessfully ");
	
	return null;
	
	
	
	
		
	}
}
