package by.jonline.module.module2.algorithmization.sort;

/*Даны две последовательности A1 <= A2 <=...<= An и B1 <= B2 <=...<= Bm . 
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 *  Примечание. Дополнительный массив не использовать.
 */

public class Task2 {

	public static void main(String[] args) {
		int[] arr1 = {1, 6, 7, 9, 16};
		int[] arr2 = {1, 2, 3, 15};
		
		
		System.out.println("Первый массив:");
		printArray(arr1);
		
		System.out.println("Второй массив:");
		printArray(arr2);
		
		
		System.out.println("Объединенный массив c последовательностю C1 <= C2 <=...<= Ci ");
		printArray(combinedArray(arr1, arr2));

	}
	
	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	private static int[] combinedArray(int[] arr1, int[] arr2) {
		int[] arrSum;
		int lengthOfArrSum;
		int n = 0;
		int m = 0;
		
		lengthOfArrSum = arr1.length + arr2.length;
		arrSum = new int[lengthOfArrSum];
		
		for(int i = 0; i < arrSum.length; i++) {
			if(m == arr2.length || arr1[n] < arr2[m] ) {
				arrSum[i] = arr1[n];
				n++;
			}else if( n == arr1.length || arr2[m] < arr1[n]) {
				arrSum[i] = arr2[m];
				m++;
			}else if(arr1[n] == arr2[m]) {
				arrSum[i] = arr1[n];
				i++;
				arrSum[i] = arr2[m];
				n++;
				m++;
			}
		}
		
		return arrSum;
	}

}
