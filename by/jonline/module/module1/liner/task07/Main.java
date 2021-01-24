package by.jonline.module.module1.liner.task07;

//Дан прямоугольник, ширина котораго в 2 раза меньше длины. Найдите площадь прямоугольника

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите ширину прямоугольника: ");
		double x = scanner.nextDouble();
		
		double S = x * 2 *x;
		System.out.println("Площадь прямоугольника равна " + S);
		scanner.close();
		
	}

}
