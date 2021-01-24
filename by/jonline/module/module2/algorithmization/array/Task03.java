package by.jonline.module.module2.algorithmization.array;

//Данн массив действительных чисел, размерность которого N.
//Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов

public class Task03 {

	public static void main(String[] args) {
		int n = 6;
		
		double[] array = new double[n];

		initArray(array);

		System.out.print("Элементы массива: ");
		printArray(array);
		System.out.println();
		
		System.out.println("Кол-во отрицательных элементов : " + negativeElement(array));
		System.out.println("Кол-во положительных элементов : " + positiveElement(array));
		System.out.println("Кол-во нулевых элементов : " + nullElement(array));
		
	}
	
	private static void initArray(double[] arr) {
		double count = (-5);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = count;
			count += 2.5;
		}
	}
	
	private static void printArray(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	private static int negativeElement(double[] arr) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				count++;
				
			}
		}
		return count;
	}
	
	private static int positiveElement(double[] arr) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				count++;
			}
		}
		return count;
	}
	
	private static int nullElement(double[] arr) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		return count;
	}
}
