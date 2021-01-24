package by.jonline.module.module2.algorithmization.sort;

/* Сортировка выбором. Дана последовательность чисел A1 <= A2 <=...<= An .
 * Требуется переставить элементы так, чтобы они были расположены по убыванию.
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент
 * и ставится на первое место, а первый - на место наибольшего.
 * Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
 */

public class Task3 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Данн массив: ");
		printArray(arr);

		selectionSort(arr);

		System.out.println("Массив отсортированный по убыванию методом выбора:");
		printArray(arr);

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int tempIndex = i;
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[j] > arr[tempIndex]) {
					tempIndex = j;
				}
				
			}
			
			if (i != tempIndex) {
				
				int temp = arr[tempIndex];
				arr[tempIndex] = arr[i];
				arr[i] = temp;
				
			}
		}
	}

}
