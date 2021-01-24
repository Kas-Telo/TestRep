package by.jonline.module.module2.algorithmization.doubleArray;

public class Task16 {

	public static void main(String[] args) {
		int n = 5;
		int[][] square = new int[n][n];
		
		System.out.println("Магический квадрат порядка " + n + ":");
		
		if (n % 2 != 0) {
			magicSquareOfOddOrder(square, n);
			printSquare(square, n);
			printSum(square);
			
		} else if (n % 2 == 0 && n % 4 != 0) {
			magicEvenOrderSquare(square, n);
			printSquare(square, n);
			printSum(square);

		} else {
			magicSquareOfEvenEvenOrder(square, n);
			printSquare(square, n );
			printSum(square);

		}
	}

	private static void magicSquareOfOddOrder(int[][] square, int n) {
		int i = 0;
		int j = ((n - 1) / 2);

		for (int k = 1; k <= (n * n); i--, j++, k++) {
			if (i >= 0 && j < n && square[i][j] == 0) {
				square[i][j] = k;

			} else if (i < 0 && j == n) {
				i = 1;
				j = (n - 1);

				square[i][j] = k;

			} else if (i < 0) {
				i = (n - 1);

				square[i][j] = k;

			} else if (j == n) {
				j = 0;

				square[i][j] = k;

			} else if (square[i][j] != 0) {
				j = j - 1;
				i = i + 2;

				square[i][j] = k;
			}
		}
	}

	private static void magicSquareOfEvenEvenOrder(int[][] square, int n) {
		int k = 1;
		int a1;

		a1 = (n / 4);

		for (int i = 0, i1 = n - 1; i < n; i++, i1--) {
			for (int j = 0, j1 = n - 1; j < n; j++, j1--, k++) {
				if (i < a1 && (j < a1 || j >= (n - a1)) || i >= (n - a1) && (j < a1 || j >= (n - a1))) {
					square[i][j] = k;
				} else if (i >= a1 && i < (n - a1) && j >= a1 && j < n - a1)  {
					square[i][j] = k;
				} else {
					square[i1][j1] = k;
				}
			}
		}
	}

	private static void magicEvenOrderSquare(int[][] square, int n) {
		int i = 0;
		int j = (n - 2) / 4;
		int k = 1;

		beginingOfTheFourSquaresMethod(square, n, k, i, j);

		i = n / 2;
		k = ((n * n) - (n * n) / 4) + 1;
		beginingOfTheFourSquaresMethod(square, n, k, i, j);

		i = 0;
		k = (n * n) / 2 + 1;
		j = n - (n / 4 + 1);
		beginingOfTheFourSquaresMethod(square, n, k, i, j);

		i = n / 2;
		k = (n * n) / 4 + 1;
		beginingOfTheFourSquaresMethod(square, n, k, i, j);

		completionOfTheFourSquareMethod(square, n);
	}

	private static void beginingOfTheFourSquaresMethod(int[][] square, int n, int value, int string, int column) {
		int counter = 1;
		int m = n;
		
		if (column == (n - 2) / 4) {
			m = n / 2;
		}
		for (int i = string, j = column, k = value; counter <= (n / 2) * (n / 2); i--, j++, k++, counter++) {
			if (i >= string && j < m && square[i][j] == 0) {
				square[i][j] = k;

			} else if ((i >= string && j < m && square[i][j] != 0) || (i < string && j == m)) {
				j = j - 1;
				i = i + 2;

				square[i][j] = k;

			} else if (i < string && j < m) {
				if (string == 0 && column == n - (n / 4 + 1)) {
					i = (n / 2) - 1;
				} else if (string == 0) {
					i = m - 1;
				} else {
					i = n - 1;
				}
				square[i][j] = k;

			} else if (j == m && i >= string) {
				if (column == (n - 2) / 4) {
					j = 0;
				} else {
					j = n / 2;
				}

				square[i][j] = k;
			}
		}
	}

	private static void completionOfTheFourSquareMethod(int[][] square, int n) {
		int m = n / 2;
		int h = (n / 2) - 1;
		int c = 1;

		int[][] arr = new int[m][c];

		for (int i = 0; i < m; i++) {
			if (i == 0 || i == m - 1) {
				arr[i][0] = square[i][0];
			} else {
				arr[i][0] = square[i][1];
			}
		}

		for (int i = 0, k = m; i < m; i++, k++) {
			if (i == 0 || i == (m - 1)) {
				square[i][0] = square[k][0];
			} else {
				square[i][1] = square[k][1];
			}
		}

		for (int i = m, k = 0; i < n; i++, k++) {
			if (i == m || i == n - 1) {
				square[i][0] = arr[k][0];
			} else {
				square[i][1] = arr[k][0];
			}
		}

		for (int t = 10, count = 0; t <= n; t += 4, count++) {

			for (int i = 0; i < m; i++) {
				int k = 0;

				k = square[i][h - count];
				square[i][h - count] = square[m + i][h - count];
				square[m + i][h - count] = k;
			}

			for (int i = 0; i < m; i++) {
				int k = 0;

				k = square[i][m + count];
				square[i][m + count] = square[m + i][m + count];
				square[m + i][m + count] = k;
			}
		}
	}

	private static void printSquare(int[][] square, int n) {
		int lenOfNumb;
		
		lenOfNumb = String.valueOf (n * n).length();
		
		String format = "%-" + (lenOfNumb + 1) + "s";
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				System.out.format(format, square[i][j]);
			}
			System.out.println();
		}
	}

	private static void printSum(int[][] arr) {
		int sum3 = 0;
		int sum4 = 0;
		int n = arr.length - 1;
		for (int i = 0; i < arr.length; i++, n--) {
			sum3 += arr[i][i];
			sum4 += arr[i][n];
			int sum1 = 0;
			int sum2 = 0;

			for (int j = 0; j < arr.length; j++) {
				sum1 = sum1 + arr[i][j];
				sum2 = sum2 + arr[j][i];
			}
			System.out.println(sum1 + "   " + sum2);
		}
		System.out.println("\nsd1 = " + sum3 + "  sd2 = " + sum4);
	}
}
