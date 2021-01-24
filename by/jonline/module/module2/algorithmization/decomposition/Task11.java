package by.jonline.module.module2.algorithmization.decomposition;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр

public class Task11 {

	public static void main(String[] args) {
		int num1 = 12098;
		int num2 = 12380;
		
		comparison(num1, num2);

	}
	
	static void comparison(int num1, int num2) {
		if(getCountsOfDigit(num1) > getCountsOfDigit(num2)) {
			System.out.format("В числе %d цифр больше чем в %d", num1, num2);
			
		}else if(getCountsOfDigit(num1) < getCountsOfDigit(num2)) {
			System.out.format("В числе %d цифр больше чем в %d", num2, num1);
			
		}else {
			System.out.format("В числе %d и %d кол-во цифр однинаково", num2, num1);
		}	
	}
	
	static int getCountsOfDigit(int number){
		int count = 0;
		
		while(number != 0) {
			number /= 10;
			count++;
		}
		return count;
	}
}
