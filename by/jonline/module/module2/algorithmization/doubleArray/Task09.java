package by.jonline.module.module2.algorithmization.doubleArray;

import java.util.Random;

/* Задана матрица неотрицательных чисел.
 * Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму.
 */

public class Task09 {

	public static void main(String[] args) {
		int i = 5;
		int j = 5;
		int arr[][] = new int[i][j];
		
		System.out.println("Дан Массив:");
		initArray(arr);
		printArray(arr);
		
		System.out.println();
		System.out.println(maxSum(sum(arr)));
		

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
		String formatOfColumn = "%-4s";

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.format(formatOfColumn, arr[i][j]);
			}
			System.out.println();
		}
	}
	
	private static int[] sum(int[][] arr) {
		int[] arrOfSum = new int[arr[0].length];
		
		for(int j = 0; j < arr[0].length; j++) {
			for(int i = 0; i < arr.length; i++) {
				arrOfSum[j] += arr[i][j];
			}
		}
		return arrOfSum;
	}
	
	private static int maxSum(int[] sum) {
		int maxSum = 0;
		int counter = 0;
		
		for(int i = 0; i < sum.length; i++) {
			if(maxSum < sum[i]) {
				maxSum = sum[i];
				counter = i + 1;
			}
		}
		System.out.print(counter + " - й столбец содержит максимальную сумму элементов: ");
		return maxSum;
	}

}
