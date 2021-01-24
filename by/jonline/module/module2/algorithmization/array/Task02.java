package by.jonline.module.module2.algorithmization.array;

import java.util.Random;

//Даны последовательность чисел A1, A2,..., Аn. Заменить все ее слены,
// большие данного Z, этим числом. Подсчитать кол-во замен.

public class Task02 {

	public static void main(String[] args) {
		int a = 9;
		int z = 35;

		int[] array = new int[a];

		initArray(array);

		System.out.print("Элементы массива: ");
		printArray(array);
		System.out.println();

		System.out.print("Элементы массива с заменой чисел больше чем " + z + ": ");
		replaceOfNumberGreaterThanZ(array, z);
		System.out.println();

	}
	

	private static void initArray(int[] arr) {
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
	}
	

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	

	private static void replaceOfNumberGreaterThanZ(int[] arr, int z) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] > z)) {
				arr[i] = z;
				System.out.print(arr[i] + " ");
				count++;
			} else
				System.out.print(arr[i] + " ");
		}
		System.out.println("\nКол-во замен: " + count);
	}
}
