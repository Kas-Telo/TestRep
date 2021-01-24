package by.jonline.module.module1.cycle.task07;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме еденицы и самого числа
// m и n вводятся с клавиатуры

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m, n;

		
		System.out.print("Введите начало промежутка m: ");
		while(!sc.hasNextInt()){
			
			System.out.println("Неверный формат введенных данных, попробуйте снова\n");
			sc.next();
			System.out.print("Введите начало промежутка m: ");
			
		}
		m = sc.nextInt();
		
		System.out.print("Введите конец промежутка n: ");
		while(!sc.hasNextInt()){
			System.out.println("Неверный формат введенных данных, попробуйте снова\n");
			sc.next();
			System.out.print("Введите конец промежутка n: ");	
			
		}
		n = sc.nextInt();
		
		
		for(int i = m; i <= n; i++) {	//перебор чисел в диапазоне от m до n
			int delitel = 1;
			
			System.out.print("Делители для числа " + i + ": ");

			for(int k = 2; k < i; k++) {
				
				if((i % k) == 0) {
					delitel = i / k;
					System.out.print(delitel + "; ");
				}
				
			}
			
			if(delitel == 1) {
				System.out.println("Для этого чесла нет делителей кроме 1 и " + i );
			}else {
				System.out.println("");
			}
			
		}

	}

}
