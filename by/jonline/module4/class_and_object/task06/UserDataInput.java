package by.jonline.module4.class_and_object.task06;

import java.util.Scanner;

public class UserDataInput {
	private Show show = new Show();

	private int enterOfIntValue() {
		Scanner sc = new Scanner(System.in);
		int valueTime = 0;

		if (!sc.hasNextInt()) {
			valueTime = -1;
			sc.next();
		} else {
			valueTime = sc.nextInt();
		}

		return valueTime;
	}

	public int timeEntry(String timeUnit) {
		int timeValue;

		if (timeUnit == "часы") {
			System.out.format("Введите %s от 0 до 23\n", timeUnit);
			show.messege(">>");
		} else {
			System.out.format("Введите %s от 0 до 59\n", timeUnit);
			show.messege(">>");
		}

		timeValue = enterOfIntValue();

		if (timeValue != -1) {
			return timeValue;
		} else {
			show.messegeLn("Некорреткный ввод, попробуйте снова!");
			return timeEntry(timeUnit);
		}
	}
}
