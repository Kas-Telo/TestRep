package by.jonline.module4.class_and_object.task09;

public class Main {

	public static void main(String[] args) {
		View view = new View();
		
		view.bookListByAuthor("Онегин");
		view.bookListReleasedByPublisher("ТипоГраф");
		view.bookListReleasedAfter(2000);

	}

}
