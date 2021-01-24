package by.jonline.module.module2.algorithmization.array;

//Даны действительные числа a1, a2, aN. Поменять местами наибольший и наименьший элемент.

public class Task04 {

	public static void main(String[] args) {
		int indexMin = 0;
		int indexMax = 0;
		int n;		//промежуточная переменная

		int[] arr = { 4, 3, 8, 5, 1 };

		System.out.print("Дана последовательность чисел: ");
		printArray(arr);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[indexMin]) {
				indexMin = i;
			}
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[indexMax]) {
				indexMax = i;
			}
		}
		
		System.out.println("Наименьший элемент: " + arr[indexMin]);
		System.out.println("Наибольший элемент: " + arr[indexMax]);

		n = arr[indexMax];
		arr[indexMax] = arr[indexMin];
		arr[indexMin] = n;

		System.out.print("Последовательность после замены их местами: ");
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
