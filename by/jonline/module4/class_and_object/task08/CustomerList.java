package by.jonline.module4.class_and_object.task08;

public class CustomerList {
	public Customer[] customerList;

	private static CustomerList customers;
	
	private CustomerList() {
		
	}

	public static CustomerList getInstance() {
		if (customers == null) {
			customers = new CustomerList();
		}
		return customers;
	}
	
	
	public void addNewCustomer() {
		Customer[] newCustomer;
		if(customerList == null) {
			newCustomer = new Customer[1];
		}else
		{
			newCustomer = new Customer[customerList.length + 1];
		}
		
		if (customerList != null) {
			for (int i = 0; i < customerList.length; i++) {
				newCustomer[i] = customerList[i];
			}
		}
				
		customerList = newCustomer;
		customerList[customerList.length - 1] = new Customer();
	}

	public void assignId() {
		int lastElement = customerList.length - 1;
		customerList[lastElement].setId(lastElement);
	}

	public void addName(String name) {
		int lastElement = customerList.length - 1;
		customerList[lastElement].setName(name);
	}

	public void addLastName(String lastName) {
		int lastElement = customerList.length - 1;
		customerList[lastElement].setLastName(lastName);
	}

	public void addPatronimic(String patronimic) {
		int lastElement = customerList.length - 1;
		customerList[lastElement].setPatronimic(patronimic);
	}

	public void addAddres(String addres) {
		int lastElement = customerList.length - 1;
		customerList[lastElement].setAddres(addres);

	}

	public void addCreditCardNumber(int number) {
		int lastElement = customerList.length - 1;
		customerList[lastElement].setCreditCardNumber(number);
	}

	public void addBankAccountNumber(String number) {
		int lastElement = customerList.length - 1;
		customerList[lastElement].setBankAccountNumber(number);
	}

	public String customerInfo(int id) {
		return customerList[id].toString();
	}
	
}
