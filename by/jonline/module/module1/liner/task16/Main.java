package by.jonline.module.module1.liner.task16;

//����� ������������ ���� ��������� ��������������� �����

public class Main {

	public static void main(String[] args) {
		
		int value = 1234;
		int result = 1;
		int digit;
		digit = (int)(value / 1000);
		result *= digit;
		digit = (int)(value / 100 % 10);
		result *= digit;
		digit = (int)(value / 10 % 10);
		result *= digit;
		digit = (int)(value % 10);
		result *= digit;
		System.out.println("������������ ���� ����� " + value + ": " + result);
		

	}

}
