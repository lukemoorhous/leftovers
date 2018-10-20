package planter.data;

import java.util.ArrayList;
import java.util.List;

public class Field {
	private String fieldName = null;
	private List<FieldRecord> records = null;
	
	public Field(String name) {
		this.fieldName = name;
		records = new ArrayList<FieldRecord>();
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
		this.records.add(record);
	}
}