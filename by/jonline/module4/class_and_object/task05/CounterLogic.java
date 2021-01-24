package by.jonline.module4.class_and_object.task05;

public class CounterLogic {

	public int currentState(Counter counter) {
		return counter.getCounter();
	}

	public void increaseInState(Counter counter) {
		counter.setCounter(currentState(counter) + 1);
	}
	
	public void decreaseInState(Counter counter) {
		counter.setCounter(currentState(counter) - 1);
	}

}
