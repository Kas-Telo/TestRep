package by.jonline.module4.class_and_object.task09;


public class Book {

	private String name;
	private String author;
	private String publisher;
	private int yearOfPublishing;
	private int numberOfPages;
	private double price;
	private String bindingType;
	
	
	public Book(String name, String author, String publisher, int yearOfPublishing, int numberOfPages,
			double price, String bindingType) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.yearOfPublishing = yearOfPublishing;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYearOfPublishing() {
		return yearOfPublishing;
	}
	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBindingType() {
		return bindingType;
	}
	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString() {
		return "Book "
				+ "  \nname = " + name 
				+ ", \nauthor = " + author 
				+ ", \npublishingHouse = " + publisher
				+ ", \nyearOfPublishing = " + yearOfPublishing 
				+ ", \nnumberOfPages = " + numberOfPages 
				+ ", \nprice = " + price
				+ ", \nbindingType = " + bindingType;
	}

}
