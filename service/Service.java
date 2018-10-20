package leftovers.service;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Service {
	
	private static Map<Question, Integer> questions = null;
	
	private static boolean found = false;
	
	private static Word word = null;
	
	public static void main(String args[]) {
		questions = new HashMap<Question, Integer>();
		do {
			query(questions);
			Map<String, Integer> words = process(questions, word);
			
			String mostLikely = null;
			int likelihood = 0;
			for (Entry<String, Integer> entry: words.entrySet()) {
				if (mostLikely == null) {
					mostLikely = entry.getKey();
					likelihood = entry.getValue();
				}
				if (entry.getValue() > likelihood) {
					likelihood = entry.getValue();
					mostLikely = entry.getKey();
				}
			}
			found = isFound(mostLikely);
		} while (!found);
		
	}
	
	public static void query(Map<Question, Integer> questions) {
		Question next = generateQuestion(questions, word);
		System.out.printf("%s\n", next.getQuestion());
		Scanner in = null;
		try {
		in = new Scanner(System.in);
		int answer = in.nextInt();
		questions.put(next, answer);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Map<String, Integer> process(Map<Question, Integer> questions, Word word) {
		Map<String, Integer> words = new HashMap<String, Integer>();
		words.put("Thingamajig", 10);
		return words;
	}
	
	public static Question generateQuestion(Map<Question, Integer> questions, Word word) {
		if (questions.size() == 0) {
			return Question.NOUN;
		}
		if (questions.get(Question.NOUN) >= 0) {
			return generateNounQuestion(questions, word);
		}
		return null;
	}
	
	public static Question generateNounQuestion(Map<Question, Integer> questions, Word word) {
		return Question.THING;
	}
	
	public static boolean isFound(String word) {
		System.out.printf("Is %s your word?\n", word);
		Scanner f = null;
		
		f = new Scanner(System.in);
		int found = f.nextInt();
		return found > 0;
	}
	
}
