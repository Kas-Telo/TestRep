package by.jonline.module.module1.liner.task04_1;

//������� �������� ��������� z = ((a - 3) * b / 2) + c

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������� �������� ��������� z = ((a - 3) * b / 2) + c");
		
		System.out.print("������� ���������� �: ");
		a = scanner.nextDouble();
		
		System.out.print("������� ���������� b: ");
		b = scanner.nextDouble();
		
		System.out.print("������� ���������� c: ");
		c = scanner.nextDouble();
		
		z = ((a - 3) * b / 2) + c;
		
		System.out.println("z = " + z);
		
	}

}
