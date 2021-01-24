package by.jonline.module.module2.algorithmization.decomposition;

import java.util.Random;

/* 
 * Составить программу, которая в массиве A[N] находит второе по величине
 * число (вывести на печать число, которое меньше
 * максимального элемента массива, но больше всех других элементов).
 */

public class Task05 {

	public static void main(String[] args) {
		int n = 10;
		int[] arr = new int[n];

		initArray(arr);

		System.out.println("Дан массив:");
		printArray(arr);

		System.out.println("Второе по величине число: " + secondLargestElement(arr));

	}

	static void initArray(int[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static int secondLargestElement(int[] arr) {
		int maxElement = arr[0];
		int secondElement = 0;

		for (int i = 1; i < arr.length; i++) {
			if (maxElement < arr[i]) {
				maxElement = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (secondElement < arr[i] && arr[i] != maxElement) {
				secondElement = arr[i];
			}
		}

		return secondElement;
	}

}
