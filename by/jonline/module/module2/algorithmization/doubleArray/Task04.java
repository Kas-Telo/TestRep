package by.jonline.module.module2.algorithmization.doubleArray;

/*—формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
	1	2	3	...	n
	n n-1 n-2	... 1
	1	2	3	...	n
	n n-1 n-2	... 1
	|	|	|	\
	n n-1 n-2	... 1
*/
public class Task04 {

	public static void main(String[] args) {
		int n = 20;
		int[][] arr = new int[n][n];

		if (n % 2 == 0) {
			initArray(arr);
			printArray(arr);
		} else {
			System.out.println("n = " + n);
			System.out.println("n не чЄтное!");
		}

	}

	private static void initArray(int[][] arr) {

		for (int i = 0; i < arr.length; i += 2) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (j + 1);
			}
		}

		for (int i = 1; i < arr.length; i += 2) {
			int n = arr.length;

			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n;
				n--;
			}
		}
	}

	private static void printArray(int[][] arr) {
		String format = "%-3s";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.format(format, arr[i][j]);
			}
			System.out.println();
		}
	}

}
