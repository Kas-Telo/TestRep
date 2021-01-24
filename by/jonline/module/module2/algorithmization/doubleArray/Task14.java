package by.jonline.module.module2.algorithmization.doubleArray;

/* Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 * причем в каждом столбце число единиц равно номеру столбца.
 */

import java.util.Random;

public class Task14 {

	public static void main(String[] args) {
		int m = 10;
		int n = 3;

		int[][] arr = new int[m][n];

		if (m < n) {
			System.out.println("Строк не может быть меньше чем столбцов." 
							+ "\nВведите другое значение");
		} else {
			initArray(arr);
			printArray(arr);
		}
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

		for (int j = 0; j < arr[0].length; j++) {
			int counter = 0;

			arr[rand.nextInt(arr.length)][j] = 1;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i][j] == 1) {
					counter++;
				}
			}
			if (counter != (j + 1)) {
				j = j - 1;
			}
		}
	}

}
