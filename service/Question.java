package leftovers.service;

public enum Question {
	
	NOUN("Your word is a noun"), 
	TRANSITIVE_VERB("Your word is something you can do"),
	THING("Your word is a thing");
	
	private String question = null;
	
	private Question(String question) {
		this.question = question;
	}
	
	public String getQuestion() {
		return question;
	}
}
