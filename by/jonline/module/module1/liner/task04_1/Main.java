package by.jonline.module.module1.liner.task04_1;

//Найдите значение выражения z = ((a - 3) * b / 2) + c

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Найдите значение выражения z = ((a - 3) * b / 2) + c");
		
		System.out.print("Введите переменную а: ");
		a = scanner.nextDouble();
		
		System.out.print("Введите переменную b: ");
		b = scanner.nextDouble();
		
		System.out.print("Введите переменную c: ");
		c = scanner.nextDouble();
		
		z = ((a - 3) * b / 2) + c;
		
		System.out.println("z = " + z);
		
	}

}
