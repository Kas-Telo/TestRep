package by.jonline.module4.class_and_object.task04;

/* Создайте класс Train, содержащий поля:
 * название пункта назначения, номер поезда, время отправления.
 *  Создайте данные в массив из пяти элементов типа Train, 
 *  добавьте возможность сортировки элементов массива по номерам поездов. 
 *  Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 *  Добавьте возможность сортировки массив по пункту назначения, 
 *  причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 * */

public class Main {

	public static void main(String[] args) {
		
		SortTrain sortTrain = new SortTrain();
		UserViewAction view = new UserViewAction();
		ShowTrainsInfo show = new ShowTrainsInfo();
		TrainsLogic logic = new TrainsLogic();
		
		Train[] trains;
		trains = logic.allTrains();
		
		show.trainSchedule(trains);
		
		sortTrain.byDestination(trains);
		show.trainSchedule(trains);
		
		sortTrain.byNumber(trains);
		show.trainSchedule(trains);
		
		view.infoAboutConcreteTrain(trains);
		
		
		

		
	}

}
