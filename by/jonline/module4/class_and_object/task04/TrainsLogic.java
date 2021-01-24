package by.jonline.module4.class_and_object.task04;

public class TrainsLogic {
	public Train[] allTrains() {

		int numberOfTrains = 5;
		Train[] trains = new Train[numberOfTrains];

		trains[0] = new Train("Mosсow", 10, 1500);
		trains[1] = new Train("Minsk", 2, 2300);
		trains[2] = new Train("Mosсow", 7, 1400);
		trains[3] = new Train("Baranovichi", 4, 1500);
		trains[4] = new Train("Brest", 3, 2000);

		return trains;
	}

	public Train findByNumber(int number) {
		Train[] trains;
		trains = allTrains();
		
		for (int i = 0; i < trains.length; i++) {
			if (number == trains[i].getTrainNumber()) {
				return trains[i];
			}
		}
		
		return null;
	}
}
