package by.jonline.module.module1.liner.task02;

//������� �������� ������� � = 3 + �

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a;
		double c;
		
		System.out.println("������� �������� �������: c = 3 + a");
		
		System.out.print("������� ����� �: ");
		a = scanner.nextDouble();
		
		c = 3 + a;
		
		System.out.println("c = " + c);
	}

}
