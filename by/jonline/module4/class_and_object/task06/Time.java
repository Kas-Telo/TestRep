package by.jonline.module4.class_and_object.task06;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time() {

	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours < 0 || hours > 23) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes < 0 || minutes > 59) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds < 0 || seconds > 59) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}

	}

}
