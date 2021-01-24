package by.jonline.module4.class_and_object.task02;

/* Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. 
 * Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Main {

	public static void main(String[] args) {
		Test2 test = new Test2(3, 7);
		
		System.out.println(test.getVar2());

	}

}
