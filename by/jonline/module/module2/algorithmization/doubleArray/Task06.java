package by.jonline.module.module2.algorithmization.doubleArray;

/*—формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
 * 1 1 1 ... 1 1 1
 * 0 1 1 ... 1 1 0
 * 0 0 1 ... 1 0 0
 * | | |   \ | | |
 * 0 1 1 ... 1 1 0
 * 1 1 1 ... 1 1 1
 */

public class Task06 {

	public static void main(String[] args) {
		int n = 8;
		int[][] arr = new int[n][n];
		
		//if(n % 2 == 0) {
			initArray(arr);
			printArray(arr);
		/*}else {
			System.out.println("n = " + n);
			System.out.println("n не чЄтное.");
		}*/
	}
	
	private static void initArray(int[][] arr) {
		int n = arr.length - 1;
		
		for(int i = 0; i < arr.length; i++) {
			if(i < (arr.length / 2)){
				
				for(int j = i; j <= n; j++) {		//единицы до серединной строки
					arr[i][j] = 1;
				}
				
			}else {
				for(int j = n; j <= i ; j++) {		//единицы после серединной строки
					arr[i][j] = 1;
				}
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
