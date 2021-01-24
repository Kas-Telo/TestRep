package by.jonline.module.module2.algorithmization.sort;

import java.util.Random;

/* Даны дроби P1/Q1, P2/Q2,..., Pn/Qn ( Pi, Qi - натуральные). Составить программу,
 * которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */

public class Task8 {

	public static void main(String[] args) {
		int n = 20;
		int[] q = new int[20];
		
		printArr(q);

	}
	
	private static void initArr(int[] arr) {
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand .nextInt(100);
		}
	}
	
	private static void printArr(int[] arr) {
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	private static void nod(int[] arr) {
		
	}

}
