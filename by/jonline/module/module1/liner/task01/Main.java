package by.jonline.module.module1.liner.task01;

//Даны два числа x и y. Вычислить их сумму, разность, произведение и частное.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x;
		double y;
		double sum;
		double diff;
		double composit;
		double priv;
		
		System.out.print("Введите первое число: ");
		x = scanner.nextDouble();
		
		System.out.print("Введите первое число: ");
		y = scanner.nextDouble();
		
		sum = x + y;
		diff = x - y;
		composit = x * y;
		priv = x / y;
		
		System.out.println("Сумма чисел = " + sum);
		System.out.println("Разность чисел = " + diff);
		System.out.println("Произведение чисел = " + composit);
		System.out.println("Частное чисел = " + priv);

	}

}
