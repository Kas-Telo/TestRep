package by.jonline.module.module1.liner.task21_4;

//���� ����� R ���� nnn.ddd(�� ��� �������� ������� ������� � �������  ����� ������).
//�������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.

public class Main {

	public static void main(String[] args) {
		double r = 123.678;
		int d;
		int n;
		
		String str;
		
		d =(int)( r * 1000 % 1000);
		n = (int)r;
		
		str = d + "." + n;
		
		System.out.println("����� : " + r );
		r = Double.parseDouble(str);
		System.out.println("����� � ������� : " + r );
	}

}
