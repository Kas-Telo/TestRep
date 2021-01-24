package by.jonline.module4.agregation_and_composition.task02;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Ford");
		
		car.printBrand();
		car.go();
		car.refuel();
		car.wheelChange(1);

	}

}
