package by.jonline.module.module1.cycle.task01;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все чилса от 1 до введенного пользователем числа
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите целое положительное число");
		System.out.print(">>");
		
		if(sc.hasNextInt()) {		//проверка на ввод числа типа Integer
			int n;
			n = sc.nextInt();
			
			if(n  > 0) {			//проверка что число положительное
				int sum = 0;
				
				for (int i = 1; i < n; i++){
					sum = sum + i;
				}
				System.out.println("Суммма всех положительных чисел до " + n + " = " + sum);
			}else {
				System.out.println("Неверный формат числа!");
			}
		}
	}

}
