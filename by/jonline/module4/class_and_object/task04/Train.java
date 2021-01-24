package by.jonline.module4.class_and_object.task04;

public class Train {
	private String destination;
	private int trainNumber;
	private int departureTime;
	
	public Train(String destination, int numOfTrain, int departureTime) {
		this.trainNumber = numOfTrain;
		this.destination = destination;
		this.departureTime = departureTime;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public int getTrainNumber() {
		return trainNumber;
	}
	
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	
	public int getDepartureTime() {
		return departureTime;
	}
	
	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	
}
