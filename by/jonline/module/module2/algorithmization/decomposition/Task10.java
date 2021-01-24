package by.jonline.module.module2.algorithmization.decomposition;

import java.util.Arrays;

/* Дано натуральное число N. Написать метод(методы) для формирования массива,
 * элементами которого являются цифры числа N.
 */

public class Task10 {

	public static void main(String[] args) {
		int number = 18964;
		
		int[] array = new int[getCountsOfDigit(number)];
		array = arrayOfDigitOfANumber(number);
		
		System.out.println("Дано число " + number);
		System.out.println("Массив из цифр этого числа:");
		System.out.println(Arrays.toString(array));
	}
	
	static int[] arrayOfDigitOfANumber(int number) {
		int length;
		length = getCountsOfDigit(number); 
		int[] array = new int[length];
		
		for(int i = length - 1; i >= 0; i--) {
			array[i] = number % 10;
			number /= 10;
		}
		
		return array;
	}
	
	static int getCountsOfDigit(int number) {
		int counter = 0;
		
		while(number != 0) {
			number /= 10;
			counter++;
		}
		
		return counter;
	}

}
