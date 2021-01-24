package by.jonline.module.module2.algorithmization.doubleArray;

//���� ���������� �������. ������� �� ����� ��������, ������� �� ���������.

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		initArray(arr);
		
		System.out.println("���� ���������� �������:");
		printArray(arr);
		System.out.println();
		
		System.out.println("��������, ������� �� 1-� ���������:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i] + " ");
		}
		System.out.println();
		
		System.out.println("��������, ������� �� 2-� ���������:");
		int j = arr.length - 1;
		for(int i = 0;i < arr.length; i++) {
			System.out.print(arr[i][j] + " ");
			j--;
		}
		System.out.println();
		
		
		
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
