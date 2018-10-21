package com.planter.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.planter.data.Field;
import com.planter.data.FieldRecord;

public class Planter {
	Collection<Field> fields = null;
	
	public static class PlanterHolder {
		private static Planter INSTANCE = new Planter();
	}
	
	public static Planter getInstance() {
		return PlanterHolder.INSTANCE;
	}
	
	private Planter() {
		fields = new ArrayList<>();
	}
	
	public void addRecord(FieldRecord record) {
		System.out.println("Step 2");
		for (Field field : fields) {
			if (field.getFieldName().equals(record.getFieldName())) {
				field.addRecord(record);
				return;
			}
		}
		Field field = new Field(record.getFieldName());
		ArrayList<FieldRecord> fieldRecords = new ArrayList<>();
		fieldRecords.add(record);

		field.setRecords(fieldRecords);

		fields.add(field);
		field.addRecord(record);
	}
	
	public FieldRecord getMostRecentRecord(String fieldName) {
		for (Field field : fields) {
			if (field.getFieldName().equals(fieldName)) {
				return field.getRecords().get(field.getRecords().size() - 1);
			}
		}
		
		return null;
	}
	
	public Field getField(String fieldName) {
		for (Field field : fields) {
			if (field.getFieldName().equals(fieldName)) {
				return field;
			}
		}
		
		return null;
	}
	
	public Collection<Field> getFields() {
		return fields;
	}
}
