package by.jonline.module.module2.algorithmization.doubleArray;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

import java.util.Random;

public class Task13 {

	public static void main(String[] args) {
		int n = 5;
		int[][] arr = new int[n][n];
		
		System.out.println("Дана матрица:");
		initArray(arr);
		printArray(arr);
		
		System.out.println();
		
		System.out.println("Отсортированная матрица. Столбцы по возрастанию:");
		sortColumnArrayAscending(arr);
		printArray(arr);
		
		System.out.println();
		
		System.out.println("Отсортированная матрица. Столбцы по убыванию:");
		sortColumnArrayDescending(arr);
		printArray(arr);
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
	
	private static void sortColumnArrayAscending(int[][] arr) {
		int additVariable;
		
		for(int j = 0; j < arr[0].length; j++) {
			for(int i = 0; j < arr.length; i++) {
				if(i == arr.length - 1) {
					break;
				}
				
				if(arr[i][j] > arr[i + 1][j]) {
					additVariable = arr[i][j];
					arr[i][j] = arr[i + 1][j];
					arr[i + 1][j] = additVariable;
					i = -1;
				}
			}
		}
	}
	
	private static void sortColumnArrayDescending(int[][] arr) {
		int additVariable;
		
		for(int j = 0; j < arr[0].length; j++) {
			for(int i = 0; j < arr.length; i++) {
				if(i == arr.length - 1) {
					break;
				}
				
				if(arr[i][j] < arr[i + 1][j]) {
					additVariable = arr[i][j];
					arr[i][j] = arr[i + 1][j];
					arr[i + 1][j] = additVariable;
					i = -1;
				}
			}
		}
	}

}
