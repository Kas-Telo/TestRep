package by.jonline.module4.class_and_object.task09;

public class Printer{

	public void nameListPrint(String[] nameListOfBooks) {

		if (nameListOfBooks == null) {
			System.out.println("Такие книги отсутствуют!");
		} else {
			for (int i = 0; i < nameListOfBooks.length; i++) {
				if (nameListOfBooks[i] == null) {
					break;
				} else {
					System.out.println(nameListOfBooks[i]);
				}
			}
		}
		System.out.println();
	}
}
