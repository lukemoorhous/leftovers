package planter.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import planter.data.Field;
import planter.data.FieldRecord;

public class Planter {
	Collection<Field> fields = null;
	
	private static class PlanterHolder {
		private static Planter INSTANCE = new Planter();
		
		public Planter getInstance() {
			return INSTANCE;
		}
	}
	
	private Planter() {
		fields = new ArrayList<Field>();
	}
	
	public void addRecord(FieldRecord record) {
		for (Field field : fields) {
			if (field.getFieldName().equals(record.getFieldName())) {
				field.addRecord(record);
				return;
			}
		}
		Field field = new Field(record.getFieldName());
		field.setRecords(Arrays.asList(new FieldRecord[] { record } ));
		fields.add(field);
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
