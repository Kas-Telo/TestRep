package by.jonline.module.module1.liner.task03;

//Найдите значение функции z = 2 * x + (y - 2) * 5

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Найдите значение выражения z = 2 * x + (y - 2) * 5");
		
		System.out.print("Введите переменную x: ");
		x  = scanner.nextDouble();
		
		System.out.print("Введите переменную y: ");
		y  = scanner.nextDouble();
		
		z = 2 * x + (y - 2) * 5;
		System.out.println("z = " + z);
		
	}

}
