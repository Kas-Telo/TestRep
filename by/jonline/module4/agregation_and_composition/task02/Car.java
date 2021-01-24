package by.jonline.module4.agregation_and_composition.task02;

public class Car {
	private String brand = "";

	private Wheel wheel1;
	private Wheel wheel2;
	private Wheel wheel3;
	private Wheel wheel4;
	
	private Engine engine;


	public Car(String brand) {
		super();
		this.brand = brand;

		wheel1 = new Wheel();
		wheel2 = new Wheel();
		wheel3 = new Wheel();
		wheel4 = new Wheel();
		
		engine = new Engine();


	}

	public void go() {
		engine.go();
	}

	public void refuel() {
		System.out.println("Заправка окончена");
	}

	public void wheelChange(int wheelNumber) {
		switch (wheelNumber) {
		case (1):
			wheel1.wheelChange();
			break;
		case (2):
			wheel2.wheelChange();
			break;
		case (3):
			wheel3.wheelChange();
			break;
		case (4):
			wheel4.wheelChange();
			break;
		}
	}

	public void printBrand() {
		System.out.println(brand);
	}

}
