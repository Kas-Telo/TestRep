package by.jonline.module.module1.liner.task06;

//�������� ��� ��� ������� ������. � n ����� ������� 80� ������. 
//������� ����� ������ � m ������� �������, ���� � ������ � ������ ������ ������
//�� 12 � ������, ��� � �����

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		final int v1 = 80; //���-�� ������ � ������� ������
		final int k = 12; //������� � ������ ����� ��������
		double valueV;	// ���-�� ������ � ������� ������
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������� ���-�� ����� �������: ");
		double n = scanner.nextDouble(); 
		valueV = (v1 / n) + k;
		System.out.print("������� ���-�� ������� �������: ");
		int m = scanner.nextInt();
		double v2 = (m * valueV); 
		System.out.println("� ������� ������� " + v2 + " ������ ������" );
		
		scanner.close();

	}

}
