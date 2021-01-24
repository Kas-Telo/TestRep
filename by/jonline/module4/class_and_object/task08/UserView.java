package by.jonline.module4.class_and_object.task08;

public class UserView {
	private DataInput input = new DataInput();
	private CustomerList customers = CustomerList.getInstance();
	private AggregationCustomer aggrCustomer = new AggregationCustomer();

	////// INFO ABOUT CUSTOMER//////
	public void customerInfo(int id) {
		System.out.println(customers.customerList[id].toString());
	}
	//////////////////////////////
	

	//////// СПИСКИ КЛИЕНТОВ ПО ЗАПРАШИВАЕМЫМ ДАННЫМ////////
	public void customerList() { // Список всех клиентов
		if (customers.customerList != null) {
			for (int i = 0; i < customers.customerList.length; i++) {
				System.out.println(customers.customerList[i].toStringName());
			}

		} else {
			System.out.println("Список клиентов пуст!");
		}
	}

	public void customerListInAlphabeticalOrder() { // Список клиентов в алфавитном порядке
		String[] customerListBeforeSort;
		int numberOfCustomer;

		if (aggrCustomer.getCustomerListInAlphabetOrder() != null) {
			customerListBeforeSort = aggrCustomer.getCustomerListInAlphabetOrder();
			numberOfCustomer = customerListBeforeSort.length;

			for (int i = 0; i < numberOfCustomer; i++) {
				System.out.println(customerListBeforeSort[i]);
			}

		} else {
			System.out.println("Список клиентов пуст!");
		}
	}

	public void customerListWhithNumberOfCreditCardInTheRange(int startRange, int finishRange) { // Список клиентов с
																									// номером карты в
																									// диапзоне
		String[] neededCustomerList;

		if (aggrCustomer.getCustomerListWhithNumberOfCreditCardInTheRange(startRange, finishRange) != null) {

			neededCustomerList = aggrCustomer.getCustomerListWhithNumberOfCreditCardInTheRange(startRange, finishRange);

			if (neededCustomerList == null) {
				System.out.println("В заданном диапазоне номеров кредитных карт, пользователей не существует!");
			}

			for (int i = 0; i < neededCustomerList.length; i++) {
				if (neededCustomerList[i] != null) {
					System.out.println(neededCustomerList[i]);
				} else {
					System.out.println("Клиенты с таким диапазоном номера карты отсутствуют!");
				}
			}

		} else {
			System.out.println("Список клиентов пуст!");
		}
	}
	////////////////////////////////////////////

	
	//////// ДОБАВЛЕНИЕ НОВОГО КЛИЕНТА////////
	public void addCustomer() {
		customers.addNewCustomer();
		customers.assignId();
		addLastName();
		addName();
		addPatronimic();
		addAddres();
		addCreditCardNumber();
		addBankAccountNumber();
	}

	private void addName() {
		String name;

		System.out.print("Введите Имя >>");
		name = input.enterDataString();

		customers.addName(name);

	}

	private void addLastName() {
		String lastName;

		System.out.print("Введите Фамилию >>");
		lastName = input.enterDataString();

		customers.addLastName(lastName);

	}

	private void addPatronimic() {
		String patronimic;

		System.out.print("Введите Отчество >>");
		patronimic = input.enterDataString();

		customers.addPatronimic(patronimic);
	}

	private void addAddres() {
		String addres;

		System.out.print("Введите адрес >>");
		addres = input.enterDataString();

		customers.addAddres(addres);
	}

	private void addCreditCardNumber() {
		int number;

		do {
			System.out.print("Введите номер кредитной карты >>");
			number = input.enterDataInt();
			if (number == -1) {
				System.out.println("Некорректный ввод, попробуйте снова");
			}

		} while (number == -1);
		customers.addCreditCardNumber(number);
	}

	private void addBankAccountNumber() {
		String number;

		System.out.print("Введите номер банковского счёта >>");
		number = input.enterDataString();

		customers.addBankAccountNumber(number);
	}
	/////////////////////////////////////////////
}
