package leftovers.service;

public class Word {
	
	private WordType type = null;
	
	public Word() {
		
	}
	
	public WordType getType() {
		return type;
	}
	
	public void setType(WordType type) {
		this.type = type;
	}
	
	public enum WordType {
		NOUN, VERB, ADJECTIVE;
	}
	
}
