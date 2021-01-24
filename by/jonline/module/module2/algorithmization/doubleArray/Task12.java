package by.jonline.module.module2.algorithmization.doubleArray;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

import java.util.Random;

public class Task12 {

	public static void main(String[] args) {
		int n = 5;
		int[][] arr = new int[n][n];
		
		System.out.println("Дана матрица:");
		initArray(arr);
		printArray(arr);
		
		System.out.println();
		
		System.out.println("Отсортированная матрица. Строки по возрастанию:");
		sortStringArrayAscending(arr);
		printArray(arr);
		
		System.out.println("Отсортированная матрица. Строки по убыванию:");
		sortStringArrayDescending(arr);
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
	
	private static void sortStringArrayAscending(int[][] arr) {
		int additVariable;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j == arr[i].length - 1) {
					break;
				}
				
				if(arr[i][j] > arr[i][j + 1]) {
					additVariable = arr[i][j];
					arr[i][j] = arr[i][j + 1];
					arr[i][j + 1] = additVariable;
					j = -1;
				}
			}
		}
	}
	
	private static void sortStringArrayDescending(int[][] arr) {
		int additVariable;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j == arr[i].length - 1) {
					break;
				}
				
				if(arr[i][j] < arr[i][j + 1]) {
					additVariable = arr[i][j];
					arr[i][j] = arr[i][j + 1];
					arr[i][j + 1] = additVariable;
					j = -1;
				}
			}
		}
	}
}
