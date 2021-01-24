package by.jonline.module.module2.algorithmization.array;

import java.util.Random;

//В массиве A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K

public class Task01 {

	public static void main(String[] args) {
		int count = 9;
		int k = 2;
		
		int[] array = new int[count];
		
		initArray(array);
		
		System.out.print("Элементы массива: ");
		printArray(array);
		System.out.println();
		
		System.out.print("Числа кратные " + k + ": ");
		multiplicityOfNumber_K(array, k);
		System.out.println();
		
		System.out.print("Сумма этих чисел: ");
		sum_multiplOfNumb_K(array, k);
		
		

	}
	
	private static void initArray(int[] arr) {
		Random rand = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
	}
	
	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	private static void multiplicityOfNumber_K(int[] arr, int k) {
		for(int i = 0; i < arr.length; i++) {
			if((arr[i] % k) == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	private static void sum_multiplOfNumb_K(int[] arr, int k) {
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if((arr[i] % k) == 0) {
				sum += arr[i];
			}
		}	
		System.out.println(sum);
	}
	
	

}
