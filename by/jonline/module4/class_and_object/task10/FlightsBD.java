package by.jonline.module4.class_and_object.task10;

public class FlightsBD {
	Airline[] flightList = new Airline[]{new Airline("Москва", 15, "Аэробус", 1200, "Понедельник"),
            			   				 new Airline("Минск", 16, "Боинг", 1300, "Вторник"),
            			   				 new Airline("Варшава", 18, "Ил", 1400, "Вторник"),
            			   				 new Airline("Берлин", 19, "Аэробус", 1430, "Среда"),
            			   				 new Airline("Гомель", 20, "Боинг", 1500, "Вторник")};
	
	private FlightsBD (){
		
	}
	
	private static FlightsBD flightsBD;
	
	public static FlightsBD getAllFlights() {
		if(flightsBD == null) {
			flightsBD = new FlightsBD();
		}
		
		return flightsBD;
	}
	
}
