package by.jonline.module.module2.algorithmization.array;

//Даны действительные числа a1, a2...aN . Найти
//max(a1 + a(2N), a2 + a(2N-1)...aN + a(N + 1))
import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		int n = 5;
		double[] a = new double[2 * n];
		double[] b = new double[n];
		
		System.out.println("Дан массив:");
		initArray(a);
		printArray(a);
		
		System.out.println("Суммы крайних элементов, стремящихся к середине:");
		b = newArray(a);
		printArray(b);
		
		System.out.println("Максимальное значение из этих сумм:");
		System.out.println(max(b));
	}
	
	
	private static void initArray(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			Random rand = new Random();
			arr[i] = rand.nextInt(50);
		}
	}
	
	private static double max(double[] arr) {
		double maxValue;
		maxValue = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
	
	
	private static double[] newArray(double[] arr) {
		int n;
		n = arr.length / 2;
		
		double[] newArray = new double[n];
		
		for(int i = 0; i < n; i++) {

			if(i == n) {
				newArray[i] = arr[i] + arr[i + 1];
				
			}else {
				newArray[i] = arr[i] + arr[((2 * n) - 1) - i];
			}
		}
		return newArray;
	}
		
	
	private static void printArray(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
