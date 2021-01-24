package by.jonline.module.module1.liner.task06;

//Написать код для решения задачи. В n малых бидонах 80л молока. 
//Сколько литов молока в m больших бидонах, если в каждом в каждом болшом бидоне
//На 12 л больше, чем в малом

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		final int v1 = 80; //кол-во литров в большом бедоне
		final int k = 12; //разница в объеме между бедонами
		double valueV;	// кол-во литров в большом бедоне
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите кол-во малых бедонов: ");
		double n = scanner.nextDouble(); 
		valueV = (v1 / n) + k;
		System.out.print("Введите кол-во больших бедонов: ");
		int m = scanner.nextInt();
		double v2 = (m * valueV); 
		System.out.println("В больших бедонах " + v2 + " литров молока" );
		
		scanner.close();

	}

}
