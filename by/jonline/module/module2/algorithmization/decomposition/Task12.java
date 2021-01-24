package by.jonline.module.module2.algorithmization.decomposition;

/* Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N
 */

public class Task12 {

	public static void main(String[] args) {
		int k = 27;
		int n = 10000;

	}

	/*static int[] a(int k, int n) {
		String str;
		int length;
		int element = 0;
		int[] a = new int[10];
		int j = 0;

		String str1;

		str = exist(k, n);
		length = str.length();
		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			str1 = "" + str.charAt(i);
			arr[i] = Integer.parseInt(str1);
		}
		
		int tab = arr.length - 1;
			
			for (int c = 1; c <= 10; c++) {
				if(c == 10) {
					tab--;
					c = 1;
				}
				arr[tab] -= c;
				for (int m = 1; m < arr.length; m++) {
					element = arr[m - 1] + arr[m];
				}
				if (element == k) {
					a[j] = element;
					j++;
				}
			}

	}

	static String exist(int k, int n) {
		int numb = 9;
		String str = Integer.toString(numb);

		while (Integer.parseInt(str) <= n) {
			if (numb >= k) {
				return str;
			}

			numb += 9;
			str += 9;
		}

		return "0";
	}

	static int getCountsOfDigit(int number) {
		int count = 0;

		while (number != 0) {
			number /= 10;
			count++;
		}

		return count;
	}
	*/

}
