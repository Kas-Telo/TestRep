package by.jonline.module.module1.liner.task02;

//Найдите значение функции с = 3 + а

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a;
		double c;
		
		System.out.println("Найдите значение функции: c = 3 + a");
		
		System.out.print("Введите число а : ");
		a = scanner.nextDouble();
		
		c = 3 + a;
		
		System.out.println("c = " + c);
	}

}
