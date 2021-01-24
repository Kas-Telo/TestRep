package by.jonline.module.module2.algorithmization.sort;

/*
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
 * Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
 *  при этом не используя дополнительный массив.
 */

public class Task1 {

	public static void main(String[] args) {
		int[] arr1 = {1, 6, 2, 6, 4, 8};
		int[] arr2 = {11, 55, 34, 12,};
		int k = 2;
		
		
		System.out.println("Первый массив:");
		printArray(arr1);
		
		System.out.println("Второй массив:");
		printArray(arr2);
		
		System.out.println("\nk = " + k);
		
		System.out.println("Объединенный массив между k и k + 1 элементами первого массива");
		printArray(combinedArray(arr1, arr2, k));
		
	}
	
	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	private static int[] combinedArray(int[] arr1, int[] arr2, int k) {
		int[] arrSum;
		int lengthOfArrSum;
		int n = 0;
		
		lengthOfArrSum = arr1.length + arr2.length;
		arrSum = new int[lengthOfArrSum];
		
		for(int i = 0; i < arrSum.length; i++) {
			if (i < k || i >= arr2.length + k) {
				
				arrSum[i] = arr1[n];
				n++;
				
			}else if(i >= k && i < arr2.length + k) {
				arrSum[i] = arr2[i - k];
			}
		}
		
		return arrSum;
	}

}
