package by.jonline.module.module2.algorithmization.decomposition;
/* Написать метод(методы) для нахождения наибольшего общего делителя
 * четырех натуральных чисел
 */

import java.util.Arrays;

public class Task02 {

	public static void main(String[] args) {
		int a, b, c, d;
		a = 78;
		b = 294;
		c = 570;
		d = 36;
		
		int[] arr = {a, b, c, d};
		
		System.out.format("НОД(%d, %d, %d, %d) = %d", a, b, c, d, gcdGeneral(arr));
		
	}
	
	static int gcdGeneral(int[] arr) {
		int gcd = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			gcd = gcd(gcd, arr[i]);
		}
		return gcd;
	}
	
	
	static int gcd(int a, int b) {
		if(b == 0) return a;
		
		return gcd(b, a % b);
	}
	

}
