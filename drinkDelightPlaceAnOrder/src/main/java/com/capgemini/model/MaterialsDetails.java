package com.capgemini.model;



public class MaterialsDetails {
	
	private static String name;
	private static double price_per_unit;
	private static double quantityValue;
	private static double quanityunit;
	//private double price;
	private static String warehouseID;
	//private static String deliveryDate;

	//private Date ManufacturingDate;
	//private Date ExpiryDate;
	//private String QualityCheck;
	//private Date processDate;
	private static int SupplierId;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		MaterialsDetails.name = name;
	}

	public static double getPrice_per_unit() {
		return price_per_unit;
	}

	public static void setPrice_per_unit(double price_per_unit) {
		MaterialsDetails.price_per_unit = price_per_unit;
	}

	public static double getQuantityValue() {
		return quantityValue;
	}

	public static void setQuantityValue(double quantityValue) {
		MaterialsDetails.quantityValue = quantityValue;
	}

	public static double getQuanityunit() {
		return quanityunit;
	}

	public static void setQuanityunit(double quanityunit) {
		MaterialsDetails.quanityunit = quanityunit;
	}

	public static String getWarehouseID() {
		return warehouseID;
	}

	public static void setWarehouseID(String warehouseID) {
		MaterialsDetails.warehouseID = warehouseID;
	}

	public static int getSupplierId() {
		return SupplierId;
	}

	public static void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}
	

}
