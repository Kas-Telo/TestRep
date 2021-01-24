package by.jonline.module.module2.algorithmization.doubleArray;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

import java.util.Random;

public class Task15 {

	public static void main(String[] args) {
		int m = 5;
		int n = 6;
		
		int[][] arr = new int[m][n];

		System.out.println("Дана матрица:");
		initArray(arr);
		printArray(arr);
		System.out.println();

		System.out.println("Наибольший элемент матрицы: " + maxValue(arr));
		System.out.println();

		switchUnevenElementOnMaxValue(arr, maxValue(arr));

		System.out.println("Матрица после замены нечётных элементов на максимальный:");
		printArray(arr);

	}

	private static void initArray(int[][] arr) {
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(100);
			}
		}
	}

	private static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.format("%-3s", arr[i][j]);
			}
			System.out.println();
		}
	}

	private static int maxValue(int[][] arr) {
		int maxValue = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (maxValue < arr[i][j]) {
					maxValue = arr[i][j];
				}
			}
		}
		return maxValue;
	}

	private static void switchUnevenElementOnMaxValue(int[][] arr, int maxValue) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((arr[i][j] % 2) != 0) {
					arr[i][j] = maxValue;
				}
			}
		}
	}

}
