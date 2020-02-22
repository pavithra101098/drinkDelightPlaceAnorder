package com.capgemini.service;

import java.util.HashMap;

import com.capgemini.dao.MaterialsDAO;
import com.capgemini.model.MaterialsDetails;

public class MaterialService {
	public  HashMap<Integer,MaterialsDetails> addData( MaterialsDetails p) { //values are stored in hashmap
		
		//System.out.println(p);
		MaterialsDAO o=new MaterialsDAO(); // creating objectReference to DAO layer
		o.storeValue(p); // using dao reference method is called 
		return null;
		
		
	}
}
