package by.jonline.module4.agregation_and_composition.task01;


public class Main {

	public static void main(String[] args) {
		Text text = new Text("Елочка");
		
		
		Sentence sentence1 = new Sentence();
		Sentence sentence2 = new Sentence();
		Sentence sentence3 = new Sentence();
		Sentence sentence4 = new Sentence();
		
		sentence1.addWord(new Word("В"));
		sentence1.addWord(new Word("лесу"));
		sentence1.addWord(new Word("родилась"));
		sentence1.addWord(new Word("ёлочка"));
		
		sentence2.addWord(new Word("В"));
		sentence2.addWord(new Word("лесу"));
		sentence2.addWord(new Word("она"));
		sentence2.addWord(new Word("росла"));
		
		sentence3.addWord(new Word("Зимой"));
		sentence3.addWord(new Word("и"));
		sentence3.addWord(new Word("летом"));
		sentence3.addWord(new Word("стройная"));
		
		sentence4.addWord(new Word("Зеленая"));
		sentence4.addWord(new Word("была"));

		
		text.addText(sentence1, sentence2, sentence3, sentence4);
		text.printText(text);

	}
	
	

}
