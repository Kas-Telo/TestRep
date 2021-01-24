package by.jonline.module4.class_and_object.task10;

public class View {
	private AggregationAirline service = new AggregationAirline();
	private Printer printer = new Printer();

	public void flightListByDestination(String destination) {
		Airline[] flightList;

		flightList = service.getFlightListByDestination(destination);

		printer.print(flightList);

	}

	public void flightListByDayOfWeek(String dayOfWeek) {
		Airline[] flightList;

		flightList = service.getFlightListByDayOfWeek(dayOfWeek);
		
		printer.print(flightList);

	}

	public void flightListByDayOfWeekAndDepartureTimeFrom(String dayOfWeek, int departureTime) {
		Airline[] flightList;

		flightList = service.getFlightListByDayOfWeekAndDepartureTimeFrom(dayOfWeek, departureTime);

		printer.print(flightList);
	}

}
