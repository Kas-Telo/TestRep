package by.jonline.module4.class_and_object.task05;

public class Counter {
	private int counter;
	private int minValue;
	private int maxValue;

	public Counter(int minValue, int maxValue) {
			int defaultValue = 0;
			this.counter = defaultValue;
			this.minValue = minValue;
			this.maxValue = maxValue;
		

	}

	public Counter(int counter, int minValue, int maxValue) {
			this.counter = counter;
			this.minValue = minValue;
			this.maxValue = maxValue;
		
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public int getMinValue() {
		return minValue;
	}
	
	public int getMaxValue() {
		return maxValue;
	}

}
