package by.jonline.module.module1.liner.task07;

//��� �������������, ������ �������� � 2 ���� ������ �����. ������� ������� ��������������

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������� ������ ��������������: ");
		double x = scanner.nextDouble();
		
		double S = x * 2 *x;
		System.out.println("������� �������������� ����� " + S);
		scanner.close();
		
	}

}
