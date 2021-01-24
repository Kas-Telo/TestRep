package by.jonline.module4.class_and_object.task09;

public class Library {
	Book[] bookList = { new Book("Война и мир", "Толстой", "НоваТел", 2018, 1274, 20, "Твердый"),
						new Book("Капитанская дочка", "Пушкин", "ТипоГраф", 2012, 130, 11, "Твердый"),
						new Book("Белая гвардия", "Булгаков", "Мультипринт", 2015, 300, 15, "Мягкий"),
						new Book("Мертвые души", "Гоголь", "Графман", 2014, 410, 17, "Твердый"),
						new Book("Дикая охота короля Стаха", "Короткевич", "ТипоГраф", 2016, 147, 10, "Мягкий") };
	
	private Library() {
		
	}

	private static Library library;

	public static Library getInstance() {
		if (library == null) {
			library = new Library();
		}
		return library;
	}
}
