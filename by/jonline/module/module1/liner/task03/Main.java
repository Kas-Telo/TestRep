package by.jonline.module.module1.liner.task03;

//������� �������� ������� z = 2 * x + (y - 2) * 5

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������� �������� ��������� z = 2 * x + (y - 2) * 5");
		
		System.out.print("������� ���������� x: ");
		x  = scanner.nextDouble();
		
		System.out.print("������� ���������� y: ");
		y  = scanner.nextDouble();
		
		z = 2 * x + (y - 2) * 5;
		System.out.println("z = " + z);
		
	}

}
