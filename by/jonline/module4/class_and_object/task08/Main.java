package by.jonline.module4.class_and_object.task08;

/*
 * Создать класс Customer, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод toString(). Создать второй класс,
 * агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 *	a) список покупателей в алфавитном порядке;
 *	b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {

	public static void main(String[] args) {
		UserView view = new UserView();
		
		view.addCustomer();
		System.out.println();
		view.addCustomer();
		System.out.println();
		view.addCustomer();
		System.out.println();
		view.addCustomer();
		System.out.println();
		
		view.customerList();
		System.out.println();
		
		view.customerListInAlphabeticalOrder();
		System.out.println();
		
		view.customerListWhithNumberOfCreditCardInTheRange(1000, 2000);
		


	}

}