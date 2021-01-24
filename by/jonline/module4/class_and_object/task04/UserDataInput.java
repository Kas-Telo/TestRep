package by.jonline.module4.class_and_object.task04;

import java.util.Scanner;

public class UserDataInput {
	
	public int enterTrainNumber(String messege) {
		Scanner scanner = new Scanner(System.in);
		ShowTrainsInfo show = new ShowTrainsInfo();
		int trainNumber;
		
		System.out.println(messege);
		System.out.print(">>");
		
		while(!scanner.hasNextInt()) {
			show.error("Некорректный ввод!");
			System.out.println(messege);
			System.out.println(">>");
			scanner.next();
		}
		trainNumber = scanner.nextInt();
		
		return trainNumber;
	}
}
