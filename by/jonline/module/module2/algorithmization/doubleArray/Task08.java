package by.jonline.module.module2.algorithmization.doubleArray;

/*� �������� ������� �������� ������� ��� ������� ����� �������,
 *  �. �. ��� �������� ������ ������� ���������
 * �� ��������������� �� ������� �������, � ��� �������� ������� ����������� � ������.
 * ������ �������� ������ ������������ � ����������.
 */

import java.util.Scanner;
import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		int i = 5;
		int j = 5;
		int[][] arr = new int[i][j];
		int numberOfColumn1 = 0;
		int numberOfColumn2 = 0;

		int column = 1;

		initArray(arr);

		System.out.println("��� ������:");
		printArray(arr);

		if (column == 1) {
			numberOfColumn1 = enterNumberOfColumn(arr, column, j);
			column++;
		}

		if (column == 2) {
			numberOfColumn2 = enterNumberOfColumn(arr, column, j);
		}

		switchColumn(arr, numberOfColumn1, numberOfColumn2);

		System.out.println("������ ����� ������ ���� ��������:");
		printArray(arr);

	}

	private static void initArray(int[][] arr) {
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(100);
			}
		}
	}

	private static void printArray(int[][] arr) {
		String formatOfColumn = "%-4s";

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.format(formatOfColumn, arr[i][j]);
			}
			System.out.println();
		}
	}

	private static int enterNumberOfColumn(int[][] arr, int column, int j) {
		Scanner sc = new Scanner(System.in);
		int numberOfColumn = 0;

		System.out.println("������� ����� " + column + " - �� �������");
		System.out.print(">> ");

		while (!sc.hasNextInt() || sc.hasNextInt()) {
			if (!sc.hasNextInt()) {
				sc.next();
				
				System.out.println("������������ ����! ���������� �����");
				System.out.print(">> ");
				
			}else{
				numberOfColumn = sc.nextInt();
				
				if(numberOfColumn < 1 || numberOfColumn > j ) {
					System.out.println("������ ������� �� ����������!"
										+ " ������� ������� ��� ������� �� 1" + " �� " + j);
					System.out.print(">> ");
					
				}else {
					break;
				}
			}
		}
		return numberOfColumn;
	}

	private static void switchColumn(int[][] arr, int numberOfColumn1, int numberOfColumn2) {
		int[] column = new int[arr.length];

		for (int i = 0; i < column.length; i++) {
			column[i] = arr[i][numberOfColumn1 - 1];
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i][numberOfColumn1 - 1] = arr[i][numberOfColumn2 - 1];
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i][numberOfColumn2 - 1] = column[i];
		}
	}
}
