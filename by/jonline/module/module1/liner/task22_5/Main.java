package by.jonline.module.module1.liner.task22_5;

//���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������.
//������� ������ �������� ������������ � �����, ������ � �������� � ��������� �����
//HH� MM��� SS�

public class Main {

	public static void main(String[] args) {
		int secIn;
		int hour;
		int minute;
		int secOut;
		
		int secInHour = 3600;
		int minInHour = 60;
		

		secIn = 3700;
		hour = secIn / secInHour;
		minute =  (secIn % secInHour) / minInHour;
		secOut = (secIn % secInHour) % minInHour;
		
		System.out.print(secIn + "� = ");
		System.out.print(hour + "� ");
		System.out.print(minute + "��� ");
		System.out.print(secOut+ "c");

	}

}
