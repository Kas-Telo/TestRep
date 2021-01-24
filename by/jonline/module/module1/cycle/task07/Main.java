package by.jonline.module.module1.cycle.task07;

import java.util.Scanner;

//��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, ����� ������� � ������ �����
// m � n �������� � ����������

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m, n;

		
		System.out.print("������� ������ ���������� m: ");
		while(!sc.hasNextInt()){
			
			System.out.println("�������� ������ ��������� ������, ���������� �����\n");
			sc.next();
			System.out.print("������� ������ ���������� m: ");
			
		}
		m = sc.nextInt();
		
		System.out.print("������� ����� ���������� n: ");
		while(!sc.hasNextInt()){
			System.out.println("�������� ������ ��������� ������, ���������� �����\n");
			sc.next();
			System.out.print("������� ����� ���������� n: ");	
			
		}
		n = sc.nextInt();
		
		
		for(int i = m; i <= n; i++) {	//������� ����� � ��������� �� m �� n
			int delitel = 1;
			
			System.out.print("�������� ��� ����� " + i + ": ");

			for(int k = 2; k < i; k++) {
				
				if((i % k) == 0) {
					delitel = i / k;
					System.out.print(delitel + "; ");
				}
				
			}
			
			if(delitel == 1) {
				System.out.println("��� ����� ����� ��� ��������� ����� 1 � " + i );
			}else {
				System.out.println("");
			}
			
		}

	}

}
