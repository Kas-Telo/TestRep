package by.jonline.module4.class_and_object.task04;

public class ShowTrainsInfo {
	public void avaliableTrainsNumbers(Train[] trains) {
		
		System.out.println("Список поездов:");
		for(int i = 0; i < trains.length; i++) {
			if(i % 5 == 0 && i != 0) {
				System.out.println();
			}
			
			System.out.format("%-3d", trains[i].getTrainNumber());
		}
		System.out.println();
	}
	
	public void train(Train train) {
		System.out.format("Поезд номер %d \nПункт назначения %s \nВремя отправления %d",
				train.getTrainNumber(), 
				train.getDestination(), 
				train.getDepartureTime());

		System.out.println();
	}
	
	public void trainSchedule(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			System.out.format("Поезд номер %d Пункт назначения %s Время отправления %d", trains[i].getTrainNumber(),
					trains[i].getDestination(), trains[i].getDepartureTime());
			System.out.println();
		}
		System.out.println();
	}
	
	public void error(String messege) {
		System.out.println(messege);
	}
	
	public void requestToEnterTrainNumber(String messege) {
		System.out.println(messege);
		System.out.print(">>");
	}
}
