package by.jonline.module.module2.algorithmization.doubleArray;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10 {

	public static void main(String[] args) {
		int[][] arr = {{1, 1, 1, 1},
					   {-2, 3, 4, 1},
					   {2, 2, 3, 4},
					   {1, 2, 3, -4}};
		
		System.out.println("Дан Массив:");
		printArray(arr);
		
		System.out.println("положительные элементы диагонали:");
		printPositiveElementOfDiagonal(arr);
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
	
	private static boolean positiveElementOfDiagonal(int[][] arr, int i) {
		boolean positiveElementOfDiagonal = false;
		
			if(arr[i][i] > 0) {
				positiveElementOfDiagonal = true;
			}
		
		return positiveElementOfDiagonal;
	}
	
	private static void printPositiveElementOfDiagonal(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(positiveElementOfDiagonal(arr, i)) {
				System.out.print(arr[i][i] + " ");
			}
		}
	}

}
