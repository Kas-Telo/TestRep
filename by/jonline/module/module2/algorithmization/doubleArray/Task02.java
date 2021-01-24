package by.jonline.module.module2.algorithmization.doubleArray;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		initArray(arr);
		
		System.out.println("Дана квадратная матрица:");
		printArray(arr);
		System.out.println();
		
		System.out.println("Элементы, стоящие на 1-й диагонали:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i] + " ");
		}
		System.out.println();
		
		System.out.println("Элементы, стоящие на 2-й диагонали:");
		int j = arr.length - 1;
		for(int i = 0;i < arr.length; i++) {
			System.out.print(arr[i][j] + " ");
			j--;
		}
		System.out.println();
		
		
		
	}
	
	private static void printArray(int[][] arr) {
		String format = "%-3s";
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i]. length; j++) {
				System.out.format(format, arr[i][j]);
			}
			System.out.println();
		}
	}
	
	private static void initArray(int[][] arr) {
		Random rand = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(10);
			}
		}
	}

}
