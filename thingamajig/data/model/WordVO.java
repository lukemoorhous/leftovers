import java.util.List;

public class WordVO {
	
	private String word = null;
	
	private WordFunction function = null;
	
	private WordRoot root = null;
	
	private AssociationSet associations = null;
	
	private List<WordVO> synonyms = null;
	
	public WordVO(String word) {
		this.word = word;
	}
	
	public WordVO(String word, WordFunction function, WordRoot root, AssociationSet associations, List<WordVO> synonyms) {
		this.word = word;
		this.function = function;
		this.root = root;
		this.associations = associations;
		this.synonyms = synonyms;
	}
	
	public WordFunction getFunction() {
		return this.function;
	}
	
	public WordRoot getRoot() {
		return this.root;
	}
	
	public AssociationSet getAssociations() {
		return this.associations;
	}
	
	public List<WordVO> getSynonyms() {
		return this.synonyms;
	}
}