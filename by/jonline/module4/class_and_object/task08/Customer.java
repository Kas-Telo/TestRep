package by.jonline.module4.class_and_object.task08;

public class Customer {
	private int id;
	private String name;
	private String lastName;
	private String patronimic;
	private String addres;
	private int creditCardNumber;
	private  String bankAccountNumber;
	
	public Customer() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPatronimic() {
		return patronimic;
	}
	public void setPatronimic(String patronimic) {
		this.patronimic = patronimic;
	}
	
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	
	public int getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	
	@Override
	public String toString() {
		return "Customer id: " + id
				+ "\nname: " + name
				+ "\nlastName: " + lastName 
				+ "\npatronimic: " + patronimic
				+ "\naddres: " + addres 
				+ "\ncreditCardNumber: " + creditCardNumber 
				+ "\nbankAccountNumber: " + bankAccountNumber;
	}
	
	public String toStringName() {
		return lastName + " " + name + " " + patronimic;
	}
	
	
}
