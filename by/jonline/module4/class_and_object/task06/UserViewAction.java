package by.jonline.module4.class_and_object.task06;

public class UserViewAction {
	private UserDataInput input = new UserDataInput();
	private Show show = new Show();
	private Time time = new Time();

	public void timeSettingAndShow() {
		show.messegeLn("Пожалуйста, установите время");
		time.setHours(input.timeEntry("часы"));

		time.setMinutes(input.timeEntry("минуты"));

		time.setSeconds(input.timeEntry("секунды"));

		show.messege("Время: ");
		show.time(time.getHours(), time.getMinutes(), time.getSeconds());
	}
}
