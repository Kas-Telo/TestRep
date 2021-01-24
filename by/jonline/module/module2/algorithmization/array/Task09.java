package by.jonline.module.module2.algorithmization.array;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
//Если таких чисел несколько, то определить наименьшее из них.

public class Task09 {

	public static void main(String[] args) {
		
		int[] arr = {-1, 1, 2, 3, 4, -1 };
		int counter1 = 0;
		int counter2 = 0;
		int repeatNumber = 0;
		
		System.out.println("Дана последовательность элементов: ");
		printArray(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					counter1++;
				}
			}

			if (counter1 > counter2) {
				
				repeatNumber = arr[i];
				counter2 = counter1;
				counter1 = 0;
			
			} else if (counter1 == counter2) {
				
				repeatNumber = Math.min(repeatNumber, arr[i]);
				counter1 = 0;
			}
		}
		
		if (counter1 == 0 && counter2 == 0) {
			System.out.println("Нет повторяющихся чисел");
		} else {
			System.out.println("Наиболее повторяющися элемент: " + repeatNumber);
		}
	}
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}