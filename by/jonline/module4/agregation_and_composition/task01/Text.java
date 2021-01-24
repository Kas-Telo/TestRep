package by.jonline.module4.agregation_and_composition.task01;

public class Text {
	private String text = "";
	private String title = "";

	public Text(String title) {
		super();
		this.title = title;
	}

	public void addText(Sentence... sentence) {
		for (Sentence sent : sentence) {
			this.text += sent;
		}

	}
	
	public void printText(Text text) {
		System.out.println(title);
		System.out.println(text);
	}

	@Override
	public String toString() {
		return text;
	}
	
}
