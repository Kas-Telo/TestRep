package by.jonline.module.module2.algorithmization.array;

//Дана последовательность целых чисел a1, a2...aN .
//Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min( a1, a2...aN).

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		int n = 20;
		int[] a = new int[n];

		initArray(a);
		System.out.println("Дана последовательность:");
		printArray(a);
		
		System.out.print("Минимальный член: ");
		System.out.println(min(a));

		System.out.println("Последовательность без минимальных членов:");
		printArray(arrayWithoutMinValue(a, min(a)));

	}

	private static void initArray(int[] arr) {
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(50);
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static int min(int[] arr) {
		int minimal = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= minimal) {
				minimal = arr[i];
			}
		}
		return minimal;
	}

	private static int arrLengthWithoutMinValue(int[] arr) {
		int newArrLength;
		newArrLength = arr.length;

		for (int i = 0; i < arr.length; i++) {
			if (min(arr) == arr[i]) {
				newArrLength--;
			}
		}
		return newArrLength;
	}

	private static int[] arrayWithoutMinValue(int[] arr, int min) {
		int n;
		n = arrLengthWithoutMinValue(arr);
		int[] newArray = new int[n];

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min(arr)) {
				newArray[j] = arr[i];
				j++;
			}
		}

		return newArray;
	}

}
