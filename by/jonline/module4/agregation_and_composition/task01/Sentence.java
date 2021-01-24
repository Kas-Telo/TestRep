package by.jonline.module4.agregation_and_composition.task01;

public class Sentence {
	String sentence = "";
	
	public Sentence() {
		
	}
	
	public void addWord(Word word) {
		sentence += word;
	}

	@Override
	public String toString() {
		return (sentence == null || sentence.length() == 0)
				? null
				: (sentence.substring(0, sentence.length() - 1)) + ".\n";
	}
	
	
}
