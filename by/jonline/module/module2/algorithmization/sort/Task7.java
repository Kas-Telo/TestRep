package by.jonline.module.module2.algorithmization.sort;

/* Пусть даны две неубывающие последовательности действительных чисел
 * A1 <= A2 <=...<= An и B1 <= B2 <=...<= Bm. Требуется указать те места,
 * на которые нужно вставлять элементы последовательности B1 <= B2 <=...<= Bm в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

public class Task7 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 3, 6, 6, 8, 10, 12 };
		int[] arr2 = { 1, 1, 3, 4, 5, 6, 6, 6, 7, 9, 11 };
		
		System.out.println("Даны два неубывающих массива");
		System.out.println("Первый:");
		printArray(arr1);
		System.out.println("Второй:");
		printArray(arr2);

		for (int m = arr2.length - 1; m >= 0; m--) {
			for (int n = arr1.length - 1; n >= 0; n--) {
				
				if (arr2[m] <= arr1[n] && arr2[m] >= arr1[n - 1]) {
					
					System.out.println("Элемент " + arr2[m] + " из 2-го массива должен стоять между " 
										+ arr1[n - 1] + " и " + arr1[n] + " первого.");
					break;
				}
			}
		}

	}
	
	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
