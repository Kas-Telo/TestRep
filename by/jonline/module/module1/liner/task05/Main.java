package by.jonline.module.module1.liner.task05;

//��������� �������� ���������� �������� ��������������� ���� �����

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("���������� �������� ���������������\n");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������� 1-� ��������: ");
		double a = scanner.nextDouble();
		
		System.out.print("������� 2-� ��������: ");
		double b = scanner.nextDouble();
		
		double avg = (a + b) / 2;
		
		System.out.println("������� �������������� = " + avg);
		scanner.close();
		

	}

}
