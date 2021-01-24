package by.jonline.module.module1.cycle.task08;

//ƒаны два числа. ќпределить цифры, вход€щие в запись как первого так и второго числа.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double aDouble;
		double bDouble;
		int aInt;
		int bInt;
		
		String str1;
		String str2;
		String str = "";	//строка цифр после сравнени€ двух чисел
		

		System.out.print("¬ведите первое число >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("¬ведите первое число >> ");
		}
		
		aDouble = sc.nextDouble();

		if ((aDouble % 1) == 0) {
			aInt = (int) aDouble;
			str1 = String.valueOf(aInt);
		} else {
			str1 = String.valueOf(aDouble);
		}
		
		

		System.out.print("¬ведите второе число >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("¬ведите второе число >> ");
		}
		
		bDouble = sc.nextDouble();
		
		if ((bDouble % 1) == 0) {
			bInt = (int) bDouble;
			str2 = String.valueOf(bInt);
		} else {
			str2 = String.valueOf(bDouble);
		}
		
		
		
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '.') {
				continue;
			}

			for (int j = 0; j < str2.length(); j++) {	//цикл сравнивает цыфры-символы из двух чисел-строк
				if (str2.charAt(j) == '.') {			//и если они совпадают, то прибавл€ет их к строке str
					continue;
				}

				if (str2.charAt(j) == str1.charAt(i)) {
					str += str2.charAt(j);
				}
			}
		}


		
		System.out.print("ќбщие цифры: ");
		for (int i = 0; i < str.length(); i++) {										
														// цикл который сравнивают числа-символы из строки str,
			for (int j = 0; j <= i; j++) { 				// и выводит повтор€ющиес€ цифры только 1 раз			
				if ((j != i) && (str.charAt(j) == str.charAt(i))) {
					break;
				} else if (j == i) {
					System.out.print(str.charAt(i) + " ");
				}
			}
		}
	}
}
