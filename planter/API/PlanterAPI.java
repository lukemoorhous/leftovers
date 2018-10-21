package planter.API;

import java.util.Collection;

import planter.data.Field;
import planter.data.FieldRecord;
import planter.app.Planter;

public class PlanterAPI {
	
	public void addRecord(String field) {
		Planter.getInstance().addRecord(new FieldRecord(field));
	}
	
	public void addRecord(String field, String crop, 
			double water, double height) {
		Planter.getInstance().addRecord(new FieldRecord(field, crop, water, height));
	}
	
	public FieldRecord getMostRecentRecord(String field) {
		return Planter.getInstance().getMostRecentRecord(field);
	}
	
	public Collection<Field> getAllFields() {
		return Planter.getInstance().getFields();
	}
	
	public Field getField(String field) {
		return Planter.getInstance().getField(field);
	}
}
