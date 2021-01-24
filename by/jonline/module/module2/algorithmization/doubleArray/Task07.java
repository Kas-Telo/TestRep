package by.jonline.module.module2.algorithmization.doubleArray;

/*
 * Сформировать квадратную матрицу порядка N по правилу:
 * A[I,J] = sin((I² - J²) / N)
 * и подсчитать количество положительных элементов в ней
 */

public class Task07 {

	public static void main(String[] args) {
		int n = 5;
		double[][] arr = new double[n][n];

		initArray(arr);
		System.out.println("n = " + n + "\n");
		System.out.println("Матрица, сформированная по правилу");
		System.out.println("A[I,J] = sin((I² - J²) / n:\n");
		printArray(arr);
		System.out.println();
		System.out.println("Положительных элементов в данной матрице: " + numberOfPositiveElement(arr));
	}

	private static void initArray(double[][] arr) {
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
			}
		}
	}

	private static void printArray(double[][] arr) {
		String formatOfColumn;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				formatOfColumn = "%-" + (maxLengthOfValueInColumn(arr, j) + 2) + "s";
				System.out.format(formatOfColumn, arr[i][j]);
			}
			System.out.println();
		}
	}

	private static int numberOfPositiveElement(double[][] arr) {
		int counter = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > 0) {
					counter++;
				}
			}
		}

		return counter;
	}

	private static int maxLengthOfValueInColumn(double[][] arr, int j) {
		int maxLength = 0;
		int lengthOfNumber;
		String strLengthOfNumber;
		

		for (int i = 0; i < arr.length; i++) {

			strLengthOfNumber = Double.toString(arr[i][j]);
			lengthOfNumber = strLengthOfNumber.length();

			if (maxLength < lengthOfNumber) {
				maxLength = lengthOfNumber;
			}
		}

		return maxLength;
	}

}
