package leftovers.service;

import java.util.Map;

public class Thingamajig {
	
	private Map<Question, Integer> questions = null;
	
	private Question asked = null;
	
	private Word word = null;
	
	public Thingamajig() {
		// Default constructor
	}
	
	public String getQuestion() {
		asked = Service.generateQuestion(questions, word);
		return asked.getQuestion();
	}
	
	public void answerQuestion(int answer) {
		questions.put(asked, answer);
	}
	
	public String getWord() {
		return Service.getWord(questions, word);
	}
}
