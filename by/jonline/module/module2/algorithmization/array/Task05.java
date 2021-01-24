package by.jonline.module.module2.algorithmization.array;

//Даны целые числа а1, а2...аN. Вывести на печать только те числа
// для которых aI > I.

public class Task05 {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 4, 3, 1, -2, 1, 4 };

		System.out.print("Дан массив: ");
		printArray(arr);
		
		System.out.print("/nЧисла для которых aI > I: ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i) {
				System.out.print(arr[i] + "  ");
			}
		}
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {

			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}

	}

}
