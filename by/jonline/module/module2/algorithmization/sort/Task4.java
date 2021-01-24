package by.jonline.module.module2.algorithmization.sort;

/*Сортировка обменами. Дана последовательность чисел A1 >= A2 >=...>= An.
 *Требуется переставить числа в порядке возрастания.
 *Для этого сравниваются два соседних числа Ai и Ai+1. Если Ai > Ai+1, то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 *Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

public class Task4 {
	private static int numberOfPermutation = 0;

	public static void main(String[] args) {

		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		System.out.println("Дан массив:");
		printArray(arr);

		exchangeSort(arr);

		System.out.println("Массив отсортированный по возрастанию методом обмена:");
		printArray(arr);

		System.out.println("Число перестановок: " + numberOfPermutation);

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void exchangeSort(int[] arr) {
		boolean bool;
		int counter = 0;

		do {

			bool = false;

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {

					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

					bool = true;
					counter++;
				}
			}

		} while (bool);
		numberOfPermutation = counter; 
	}
}
