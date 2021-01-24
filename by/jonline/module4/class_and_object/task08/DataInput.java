package by.jonline.module4.class_and_object.task08;

import java.util.Scanner;

public class DataInput {
	private Scanner sc = new Scanner(System.in);
	
	public String enterDataString() {
		String str = sc.next();
		
		return str;
	}
	
	public int enterDataInt() {
		int value;
		
		if(!sc.hasNextInt()) {
			sc.next();
			value = - 1;
		}else {
			value = sc.nextInt();
		}
		
		return value;
	}

}
