package by.jonline.module.module1.liner.task05;

//Составить алгоритм нахождения среднего арифметического двух чисел

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Нахождение среднего арифметического\n");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите 1-е значение: ");
		double a = scanner.nextDouble();
		
		System.out.print("Введите 2-е значение: ");
		double b = scanner.nextDouble();
		
		double avg = (a + b) / 2;
		
		System.out.println("Среднее арифметическое = " + avg);
		scanner.close();
		

	}

}
