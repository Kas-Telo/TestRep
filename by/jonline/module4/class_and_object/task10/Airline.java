package by.jonline.module4.class_and_object.task10;

public class Airline {
	private String destination;
	private int flightNumber;
	private String aircraftType;
	private int departureTime;
	private String dayOfWeek;


	public Airline(String destination, int flightNumber, String aircraftType, int departureTime, String dayOfWeek) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;
	}
	
	

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}
	

	
	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	
	

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	
	
	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", aircraftType="
				+ aircraftType + ", departureTime=" + departureTime + ", dayOfWeek=" + dayOfWeek + "]";
	}
	
	

}
