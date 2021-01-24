package by.jonline.module.module2.algorithmization.sort;

/*Сортировка вставками. Дана последовательность чисел A1, A2, ..., An .
 *Требуется переставить числа в порядке возрастания. Делается это следующим образом. 
 *Пусть A1, A2, ..., Ai - упорядоченная последовательность, т. е. A1 <= A2 <= ... <= An. 
 *Берется следующее число i+1 a и вставляется в последовательность так, чтобы новая
 *последовательность была тоже возрастающей. Процесс производится до тех пор,
 *пока все элементы от i +1 до n не будут перебраны. 
 *Примечание. Место помещения очередного элемента в отсортированную часть производить
 *с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

import java.util.Random;
public class Task5 {

	public static void main(String[] args) {
		
		int[] arr = new int[20];
		init(arr);
		System.out.println("Дан массив:");
		//printArray(arr);
		
		sortByInsert(arr);
		
		System.out.println("Отсортированный массив по возрастанию методом вставки:");
		//printArray(arr);

	}
	
	private static void init(int[] arr) {
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(15);
		}
	}
	
	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	private static int binarySearch(int[] arr, int elementToFind, int endIndex) {
		int startIndex = 0;
		int middleIndex = 0;

		while(startIndex <= endIndex) {
			middleIndex = startIndex + (endIndex - startIndex) / 2;
			
			if(elementToFind < arr[middleIndex]) {
				endIndex = middleIndex - 1;
			}else  {
				startIndex = middleIndex + 1;
			}
		}
		return startIndex;
	}
	
	private static void sortByInsert(int[] arr) {
		long start = System.nanoTime();
		int temp;
		int indexToFind;
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) {
				temp = arr[i + 1];
				indexToFind = binarySearch(arr, temp, i + 1);
				
				for(int j = i + 1; j > indexToFind; j--) {
					arr[j] = arr[j - 1];
				}
				
				arr[indexToFind] = temp;
			}
		}
		long stop = System.nanoTime();
		System.out.println(stop - start);
	}

}
