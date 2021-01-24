package by.jonline.module4.class_and_object.task10;

public class AggregationAirline {
	private FlightsBD flightsBD = FlightsBD.getAllFlights();

	public Airline[] getFlightListByDestination(String destination) {
		int numberOfFlights;
		Airline[] flightlist;
		
		numberOfFlights = flightsBD.flightList.length;
		flightlist = new Airline[numberOfFlights];

		int j = 0;
		for (int i = 0; i < numberOfFlights; i++) {
			if (destination.equals(flightsBD.flightList[i].getDestination())) {
				flightlist[j] = flightsBD.flightList[i];
				j++;
			}
		}

		if (j == 0) {
			flightlist = null;
		}

		return flightlist;
	}

	public Airline[] getFlightListByDayOfWeek(String dayOfWeek) {
		int numberOfFlights;
		Airline[] flightlist;

		numberOfFlights = flightsBD.flightList.length;
		flightlist = new Airline[numberOfFlights];

		int j = 0;
		for (int i = 0; i < numberOfFlights; i++) {
			if (dayOfWeek.equals(flightsBD.flightList[i].getDayOfWeek())) {
				flightlist[j] = flightsBD.flightList[i];
				j++;
			}
		}

		if (j == 0) {
			flightlist = null;
		}
		return flightlist;
	}

	public Airline[] getFlightListByDayOfWeekAndDepartureTimeFrom(String dayOfWeek, int departureTime) {
		Airline[] flightList = null;

		if (getFlightListByDayOfWeek(dayOfWeek) != null) {
			int numberOfFlights;
			
			numberOfFlights = getFlightListByDayOfWeek(dayOfWeek).length;
			flightList = new Airline[numberOfFlights];

			int j = 0;
			for (int i = 0; i < numberOfFlights; i++) {
				if (getFlightListByDayOfWeek(dayOfWeek)[i] != null) {
					
					if (departureTime < getFlightListByDayOfWeek(dayOfWeek)[i].getDepartureTime()) {
						flightList[j] = getFlightListByDayOfWeek(dayOfWeek)[i];
						j++;
					}
					
				}else break;
			}

			if (j == 0) {
				flightList = null;
			}
		}
		return flightList;
	}
}
