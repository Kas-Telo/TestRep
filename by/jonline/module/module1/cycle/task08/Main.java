package by.jonline.module.module1.cycle.task08;

//���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double aDouble;
		double bDouble;
		int aInt;
		int bInt;
		
		String str1;
		String str2;
		String str = "";	//������ ���� ����� ��������� ���� �����
		

		System.out.print("������� ������ ����� >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� ������ ����� >> ");
		}
		
		aDouble = sc.nextDouble();

		if ((aDouble % 1) == 0) {
			aInt = (int) aDouble;
			str1 = String.valueOf(aInt);
		} else {
			str1 = String.valueOf(aDouble);
		}
		
		

		System.out.print("������� ������ ����� >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� ������ ����� >> ");
		}
		
		bDouble = sc.nextDouble();
		
		if ((bDouble % 1) == 0) {
			bInt = (int) bDouble;
			str2 = String.valueOf(bInt);
		} else {
			str2 = String.valueOf(bDouble);
		}
		
		
		
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '.') {
				continue;
			}

			for (int j = 0; j < str2.length(); j++) {	//���� ���������� �����-������� �� ���� �����-�����
				if (str2.charAt(j) == '.') {			//� ���� ��� ���������, �� ���������� �� � ������ str
					continue;
				}

				if (str2.charAt(j) == str1.charAt(i)) {
					str += str2.charAt(j);
				}
			}
		}


		
		System.out.print("����� �����: ");
		for (int i = 0; i < str.length(); i++) {										
														// ���� ������� ���������� �����-������� �� ������ str,
			for (int j = 0; j <= i; j++) { 				// � ������� ������������� ����� ������ 1 ���			
				if ((j != i) && (str.charAt(j) == str.charAt(i))) {
					break;
				} else if (j == i) {
					System.out.print(str.charAt(i) + " ");
				}
			}
		}
	}
}
