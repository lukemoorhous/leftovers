package com.planter.data;

public class FieldRecord {

	private String fieldName = null;
	private String crop = null;
	private double water = 0;
	private double height = 0;
	
	public FieldRecord(String fieldName) {
		setFieldName(fieldName);
	}
	
	public FieldRecord(String fieldName, String crop, double water, double height) {
		setFieldName(fieldName);
		setCrop(crop);
		setWater(water);
		setHeight(height);
	}
	
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	public String getFieldName() {
		return this.fieldName;
	}
	
	public String getCrop() {
		return this.crop;
	}
	
	public void setCrop(String crop) {
		this.crop = crop;
	}
	
	public double getWater() {
		return this.water;	
	}
	
	public void setWater(double water) {
		this.water = water;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
}
