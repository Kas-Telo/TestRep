package by.jonline.module4.agregation_and_composition.task01;


public class Main {

	public static void main(String[] args) {
		Text text = new Text("������");
		
		
		Sentence sentence1 = new Sentence();
		Sentence sentence2 = new Sentence();
		Sentence sentence3 = new Sentence();
		Sentence sentence4 = new Sentence();
		
		sentence1.addWord(new Word("�"));
		sentence1.addWord(new Word("����"));
		sentence1.addWord(new Word("��������"));
		sentence1.addWord(new Word("������"));
		
		sentence2.addWord(new Word("�"));
		sentence2.addWord(new Word("����"));
		sentence2.addWord(new Word("���"));
		sentence2.addWord(new Word("�����"));
		
		sentence3.addWord(new Word("�����"));
		sentence3.addWord(new Word("�"));
		sentence3.addWord(new Word("�����"));
		sentence3.addWord(new Word("��������"));
		
		sentence4.addWord(new Word("�������"));
		sentence4.addWord(new Word("����"));

		
		text.addText(sentence1, sentence2, sentence3, sentence4);
		text.printText(text);

	}
	
	

}
