package by.jonline.module4.class_and_object.task10;

public class Printer {
	public void print(Airline[] flightList) {
		if (flightList == null) {
			System.out.println("Список пуст");
		} else {
			for (int i = 0; i < flightList.length; i++) {
				if (flightList[i] == null) {
					break;
				}
				System.out.println(flightList[i].toString());
			}
			System.out.println();
		}
	}

}
