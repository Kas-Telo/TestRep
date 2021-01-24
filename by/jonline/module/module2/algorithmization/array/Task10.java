package by.jonline.module.module2.algorithmization.array;

/*Дан целочисленный массив с количеством элементов п.
Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями).
Примечание. Дополнительный массив не использовать.
*/

public class Task10 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 2, 4, -1, 9, -5, 7, 10 };

		System.out.println("Данн массив:");
		printArray(arr);
		
		System.out.println("Массив после сжатия:");
		compressArray(arr);
		printArray(arr);

	}
	

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	
	private static void compressArray(int[] arr) {
		int j = 1;
		for (int i = 0; i < arr.length; i++) {
			if((i + 1) == arr.length) {
				break;
			}else 
			if (((i + 1) % 2) == 0) {
				arr[j] = arr[i + 1];
				j++;
			}
		}
		for(int i = (arr.length-1); i >= j; i--) {
			arr[i] = 0;
		}
	}
}
