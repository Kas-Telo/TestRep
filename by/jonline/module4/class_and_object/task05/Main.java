package by.jonline.module4.class_and_object.task05;

/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать
 * свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика 
 * значениями по умолчанию и произвольными значениями. Счетчик имеет методы увеличения 
 * и уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать код, 
 * демонстрирующий все возможности класса
 */

public class Main {

	public static void main(String[] args) {
		Counter counter1 = new Counter(0, 10);
		Counter counter2 = new Counter(0, 1, 10);
		ViewPossibility view = new ViewPossibility();
		
		if (counter1.getCounter() > counter1.getMaxValue() || counter1.getCounter() < counter1.getMinValue()) {
			Show.messege("Счётчик 1");
			view.currentStateOfCounter(counter1);
			Show.messege("Значение счётчика должно быть в пределах заданного диапазона");
		} else {
			Show.messege("Счётчик 1");
			view.currentStateOfCounter(counter1);
			view.increaseOfCounter(counter1);
			view.currentStateOfCounter(counter1);
			view.decreaseOfCounter(counter1);
			view.currentStateOfCounter(counter1);
			view.decreaseOfCounter(counter1);
		}
		
		if (counter2.getCounter() > counter2.getMaxValue() || counter2.getCounter() < counter2.getMinValue()) {
			Show.messege("Счётчик 2");
			view.currentStateOfCounter(counter2);
			Show.messege("Значение счётчика должно быть в пределах заданного диапазона");
		} else {
			Show.messege("Счётчик 2");
			view.currentStateOfCounter(counter2);
			view.increaseOfCounter(counter2);
			view.currentStateOfCounter(counter2);
			view.decreaseOfCounter(counter2);
			view.currentStateOfCounter(counter2);
			view.decreaseOfCounter(counter2);
		}
	}
}
