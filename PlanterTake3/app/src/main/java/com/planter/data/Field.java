package com.planter.data;

import java.util.ArrayList;
import java.util.List;

public class Field {
	private String fieldName = null;
	private List<FieldRecord> records;
	
	public Field(String name) {
		this.fieldName = name;
		records = new ArrayList<>();
	}
	public String getFieldName() {
		return fieldName;
	}
	public List<FieldRecord> getRecords() {
		return records;
	}
	public void setRecords(List<FieldRecord> records) {
		this.records = records;
	}
	public void addRecord(FieldRecord record) {
		System.out.print("hi");
		System.out.println(record);
		System.out.println(records.size());
		this.records.add(record);
	}
}