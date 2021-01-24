package by.jonline.module4.class_and_object.task10;

public class Main {

	public static void main(String[] args) {
		View view = new View();
		
		view.flightListByDestination("Москва");
		view.flightListByDayOfWeek("Понедельник");
		view.flightListByDayOfWeekAndDepartureTimeFrom("Вторник", 1300);

	}

}
