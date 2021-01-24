package by.jonline.module.module2.algorithmization.doubleArray;

/*—формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
1	1	1	...   1   1   1
2   2   2   ...   2   2   0
3	3	3	...	  3   0   0
|	|	|	  \   |   |   |
n-1 n-1 0	...   0   0   0
n   0   0   ...   0   0   0
*/

public class Task05 {

	public static void main(String[] args) {
		int n = 10;
		int[][] arr = new int[n][n];

		if (n % 2 == 0) {
			initArray(arr);
			printArray(arr);

		} else {
			System.out.println("n = " + n);
			System.out.println("n не чЄтное.");
		}
	}

	private static void initArray(int arr[][]) {
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = i + 1;
			}
			n--;
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

}
