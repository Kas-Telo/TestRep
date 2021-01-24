package by.jonline.module.module2.algorithmization.sort;
/* Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента Ai и Ai+1.
 * Если Ai <= Ai+1 , то продвигаются на один элемент вперед. Ai > Ai+1 ,
 * то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
*/
public class Task6 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 6, 5, 7, 3, 9, 8};
		
		System.out.println("Дан массив:");
		printArray(arr);
		
		sortOfShell(arr);
		
		System.out.println("Отсортированный массив по возрастанию методом Шелла");
		printArray(arr);

	}
	
	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	private static void sortOfShell(int[] arr) {
		long start = System.nanoTime();
		int temp;
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) {
				
				temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
				
				if(i != 0) {
					i -= 2;
				}
			}
		}
		long stop = System.nanoTime();
		System.out.println(stop - start);
	}
	
	

}
