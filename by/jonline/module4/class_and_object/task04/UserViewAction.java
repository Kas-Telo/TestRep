package by.jonline.module4.class_and_object.task04;

public class UserViewAction {
	private UserDataInput input = new UserDataInput();
	private ShowTrainsInfo show = new ShowTrainsInfo();
	private TrainsLogic logic = new TrainsLogic();

	public void infoAboutConcreteTrain(Train[] trains) {

		int requestNumber;
		Train train;

		show.avaliableTrainsNumbers(trains);

		do {
			requestNumber = input.enterTrainNumber("Пожалуйста, выберете номер поезда");
			train = logic.findByNumber(requestNumber);
			
			if (train == null) {
				show.error("Такого поезда не существует!");
			}
		} while (train == null);

		show.train(train);
	}
}
