package by.jonline.module.module2.algorithmization.doubleArray;

//���� �������. ������� k-� ������ � p-� ������� �������.

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		int[][] arr = new int[5][10];
		
		int k = 2;
		int p = 3;
		
		initArray(arr);
		
		System.out.println("����� �������:");
		printArray(arr);
		System.out.println();
		
		System.out.println("������ ��� ������� " + k);
		if(k < 1 || k > arr.length) {
			System.out.println("����� ������ �� ����������!");
			
		}else {
			for(int i = 0; i < arr[k - 1].length; i++) {
				System.out.print(arr[k - 1][i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("������� ��� ������� " + p);
		if(p < 1 || p > arr[0].length) {
			System.out.println("����� ������� �� ����������!");
			
		}else {
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i][p - 1] + " ");
			}
		}
		
	}
	
	private static void printArray(int[][] arr) {
		String format = "%-3s";
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i]. length; j++) {
				System.out.format(format, arr[i][j]);
			}
			System.out.println();
		}
	}
	
	private static void initArray(int[][] arr) {
		Random rand = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(10);
			}
		}
	}
}
