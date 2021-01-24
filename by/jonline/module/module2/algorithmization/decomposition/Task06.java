package by.jonline.module.module2.algorithmization.decomposition;

/*
 * Написать метод(методы), проверяющий,
 * являются ли данные три числа взаимно простыми
 */

public class Task06 {

	public static void main(String[] args) {
		int a = 15;
		int b = 25;
		int c = 17;
		
		System.out.format("Даны 3 числа: %d, %d, %d%n", a, b, c);
		
		if(verificationOfMutualSimplicity(a, b, c)) {
			System.out.println("Числа взаимно простые.");
		}else {
			System.out.println("Числа не являются взаимно простыми.");
		}

	}
	
	static boolean verificationOfMutualSimplicity(int a, int b, int c) {
		if(gcdGeneral(a, b, c) == 1) {
			return true;
		}
		return false;
	}
	
	static int gcdGeneral(int a, int b, int c) {
		int gcd = a;
		
		gcd = gcd(gcd, b);
		gcd = gcd(gcd, c);
		
		return gcd;
	}
	
	static int gcd(int a, int b) {
		if(b == 0)  return a;
		
		return gcd(b, a%b);	
	}
}
