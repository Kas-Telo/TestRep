package by.jonline.module4.class_and_object.task05;

public class ViewPossibility {
	private CounterLogic logic = new CounterLogic();
	private Show show = new Show();
	
	public void increaseOfCounter(Counter counter) {
		if(logic.currentState(counter) == counter.getMaxValue()) {
			Show.messege("Счётчик достиг максимальное значение");
		}else {
			logic.increaseInState(counter);
		}
	}

	public void decreaseOfCounter(Counter counter) {
		if(logic.currentState(counter) == counter.getMinValue()) {
			Show.messege("Счётчик достиг минимальное значение");
		}else {
			logic.decreaseInState(counter);
		}
	}
	
	public void currentStateOfCounter(Counter counter) {
		Show.messege("Текущее состояние счётчика");
		show.counterState(logic.currentState(counter));
	}
}
