package by.jonline.module4.class_and_object.task09;

public class View {
	private AggregationBook aggrBook = new AggregationBook();
	private Printer printer = new Printer();

	public void bookListByAuthor(String author) {
		String[] nameListOfBooks;
		nameListOfBooks = aggrBook.getBookListByAuthor(author);

		printer.nameListPrint(nameListOfBooks);
	}

	public void bookListReleasedByPublisher(String publisher) {
		String[] nameListOfBooks;
		nameListOfBooks = aggrBook.getBookListReleasedByPublisher(publisher);

		printer.nameListPrint(nameListOfBooks);

	}

	public void bookListReleasedAfter(int year) {
		String[] nameListOfBooks;
		nameListOfBooks = aggrBook.getBookListReleasedAfter(year);

		printer.nameListPrint(nameListOfBooks);

	}
}
