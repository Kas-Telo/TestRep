package by.jonline.module.module1.liner.task01;

//���� ��� ����� x � y. ��������� �� �����, ��������, ������������ � �������.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x;
		double y;
		double sum;
		double diff;
		double composit;
		double priv;
		
		System.out.print("������� ������ �����: ");
		x = scanner.nextDouble();
		
		System.out.print("������� ������ �����: ");
		y = scanner.nextDouble();
		
		sum = x + y;
		diff = x - y;
		composit = x * y;
		priv = x / y;
		
		System.out.println("����� ����� = " + sum);
		System.out.println("�������� ����� = " + diff);
		System.out.println("������������ ����� = " + composit);
		System.out.println("������� ����� = " + priv);

	}

}
