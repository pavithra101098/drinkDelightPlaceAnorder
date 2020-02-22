package com.capgemini.ui;

import java.util.Date;
import java.util.Scanner;

import com.capgemini.model.MaterialsDetails;
import com.capgemini.service.MaterialService;
public class Main {

	static String name;
	static double price_per_unit;
	static double quantityValue;
	static double quanityunit;
	double price;
	static String warehouseID;
	static String deliveryDate;
    Date ManufacturingDate;
	Date ExpiryDate;
	String QualityCheck;
	Date processDate;
	static int SupplierId;
	enum module1 {P,R}; // p and r of similar types.enum used to define our own data types 

	public static void main(String[] args) throws PlaceOrderException {
	
		String module = null; //declared a variable and initialised it to null
		
Scanner sc=new Scanner(System.in); // Scanner initialising
MaterialsDetails p=new MaterialsDetails(); // creating model reference


//System.out.println("Place an order");
MaterialService sr=new  MaterialService(); // service layer reference 


System.out.println("Place an order");

System.out.println( "Raw Material" );
System.out.println(" Product Stock");
System.out.println("Enter Material (R,P) : ");//module1.valueOf

module=sc.nextLine(); // from console we give module value
//System.out.println("You entered module is  : " );   
try {
	switch(module1.valueOf(module)) // module value is converted to int value and is store in module1
	{


	case R:
		System.out.println("Enter the Raw Material Name");
		name=sc.nextLine();
		p.setName(name); // setting values into material bean 
	
		
		System.out.println("Enter the Supplier ID");
		SupplierId=sc.nextInt();
		p.setSupplierId(SupplierId); // setting value into supplierID
		
		System.out.println("Enter the Warehouse ID");
		warehouseID=sc.next();
		p.setWarehouseID(warehouseID); //setting values to warehouseID
		
		System.out.println("Enter Quantity value and unit");
		quantityValue=sc.nextDouble();
		p.setQuantityValue(quantityValue);
		 quanityunit=sc.nextDouble();
		p.setQuanityunit(quanityunit);
		System.out.println("Enter Price per Unit");
		price_per_unit=sc.nextDouble();
		p.setPrice_per_unit(price_per_unit);
		sr.addData(p); // sending values to adddata method in service layer 
			/*
			 * System.out.println("Enter Expected Date of delivery");
			 * deliveryDate=sc.nextLine();
			 */
		//System.out.println(p.getName());
		 break;
	case P:
		System.out.println("Enter the Product Name");
		name=sc.nextLine();
		p.setName(name);
		
		System.out.println("Enter the Supplier ID");
		SupplierId=sc.nextInt();
		p.setSupplierId(SupplierId);
		
		System.out.println("Enter the Warehouse ID");
		warehouseID=sc.next();
		p.setWarehouseID(warehouseID);
		
		System.out.println("Enter Quantity value and unit");
		quantityValue=sc.nextDouble();
		p.setQuantityValue(quantityValue);
		 quanityunit=sc.nextDouble();
		 p.setQuanityunit(quanityunit);
		
		System.out.println("Enter Price per Unit");
		price_per_unit=sc.nextDouble();
		p.setPrice_per_unit(price_per_unit);
		
		sr.addData(p);
		break;
		
		

	}
	}
	catch(Exception e) {
		throw new PlaceOrderException("Entered Module is Invalid and your Order is not Placed");
		
	
	}
}
}
