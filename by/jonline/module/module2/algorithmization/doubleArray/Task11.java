package by.jonline.module.module2.algorithmization.doubleArray;

/* Матрицу 10x20 заполнить случайными числами от 0 до 15.
 * Вывести на экран саму матрицу и номера строк,
 * в которых число 5 встречается три и более раз*/

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int[][] arr = new int[i][j];

		initArray(arr);
		printArray(arr);

		printNumberOfStringWithNumberFive(arr);

	}

	private static void printArray(int[][] arr) {
		String formatOfColumn = "%-3s";

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.format(formatOfColumn, arr[i][j]);
			}
			System.out.println();
		}
	}

	private static void initArray(int[][] arr) {
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(15);
			}
		}
	}

	private static int counterOfNumberFive(int[][] arr, int i) {
		int counter = 0;
		for (int j = 0; j < arr[i].length; j++) {
			if (arr[i][j] == 5) {
				counter++;
			}
		}
		return counter;
	}

	private static void printNumberOfStringWithNumberFive(int[][] arr) {
		int counterOfString = 0;
		
		System.out.println("Число 5 встречается 3 и более раз в строках под номерами:");
		for (int i = 0; i < arr.length; i++) {
			if (counterOfNumberFive(arr, i) >= 3) {
				System.out.print(i + 1 + " ");
				counterOfString++;
			}
		}
		if (counterOfString == 0) {
			System.out.println("Таких строк в этой матрице нет!");
		}
	}

}
