package by.jonline.module.module2.algorithmization.decomposition;

/* Написать метод(методы) для вычисления суммы факториалов
 * всех нечетных чисел от 1 до 9
 */
public class Task07 {

	public static void main(String[] args) {
		int start = 1;
		int finish = 9;
		
		System.out.format("Сумма нечётных факториалов на промежутке от %d до %d = %d",
								start, finish, sumOddFactFromOneToNine(start, finish));
	}
	
	static int sumOddFactFromOneToNine(int start, int finish) {
		int sum = 0;
		
		for(int i = start; i <= finish; i += 2) {
			sum += fact(i);
		}
		
		return sum;
	}
	
	static int fact(int number) {
		if(number < 0) return 0;
		if(number == 0) return 1;
		
		return number * fact(number - 1);	
	}
}
