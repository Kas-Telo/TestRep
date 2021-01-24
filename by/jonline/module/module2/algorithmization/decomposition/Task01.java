package by.jonline.module.module2.algorithmization.decomposition;

/* Написать метод(методы) для нахождения наибольшего общего делителя
 * и наименьшего общего кратного двух натуральных чисел:
 * НОК(А, В) = ((A * B) / НОД(A, B))
 */

public class Task01 {

	public static void main(String[] args) {
		int a = 24;
		int b = 30;
		
		if (a == 0 || b == 0) {
			System.out.println("Числа должны быть натуральными и не равняться нулю!");
		} else {
			System.out.println("НОД(" + a + ", " + b + ") = " + nod(a, b));

			System.out.println("НОК(" + a + ", " + b + ") = " + nok(a, b));
		}
	}

	private static int nod(int a, int b) {
		while(a > 0 && b > 0) {
			if(a >= b) {
				a %= b;
			}else {
				b %= a;
			}
		}return a + b;
	}

	private static int nok(int a, int b) {
		int nok = 1;

		if (isPrime(a) && isPrime(b)) {
			nok = a * b;
		} else {
			nok = a * b / nod(a, b);
		}

		return nok;
	}
	
	private static boolean isPrime(int number) {
		for(int i = 2; i * i <= number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
