package by.jonline.module4.class_and_object.task09;

public class AggregationBook {
	private Library library = Library.getInstance();

	public String[] getBookListByAuthor(String author) {
		String[] nameListOfBooks;
		int lengthOfBookList;
		
		lengthOfBookList = library.bookList.length;
		nameListOfBooks = new String[lengthOfBookList];
		
		for(int i = 0; i < library.bookList.length; i++) {
			if(library.bookList[i].getAuthor() == author) {
				nameListOfBooks[i] = library.bookList[i].getName();
			}
		}
		
		if(nameListOfBooks[0] == null) {
			nameListOfBooks = null;
		}
		
		return nameListOfBooks;
	}
	

	public String[] getBookListReleasedByPublisher(String publisher) {
		
		String[] nameListOfBooks;
		int lengthOfBookList;
		
		lengthOfBookList = library.bookList.length;
		nameListOfBooks = new String[lengthOfBookList];
		int j = 0;
		for(int i = 0; i < library.bookList.length; i++) {
			if(library.bookList[i].getPublisher() == publisher) {
				nameListOfBooks[j] = library.bookList[i].getName();
				j++;
			}
		}
		
		if(nameListOfBooks[0] == null) {
			nameListOfBooks = null;
		}
		
		return nameListOfBooks;
	}
	

	public String[] getBookListReleasedAfter(int year) {
		
		String[] nameListOfBooks;
		int lengthOfBookList;
		
		lengthOfBookList = library.bookList.length;
		nameListOfBooks = new String[lengthOfBookList];
		
		for(int i = 0; i < library.bookList.length; i++) {
			if(library.bookList[i].getYearOfPublishing() > year) {
				nameListOfBooks[i] = library.bookList[i].getName();
			}
		}
		
		if(nameListOfBooks[0] == null) {
			nameListOfBooks = null;
		}
		
		return nameListOfBooks;
	}
	
	
}
