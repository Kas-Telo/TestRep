package by.jonline.module.module1.liner.task23;

//����� ������� ������, ���������� ������ �������� ����� r, � ������� - R(R>r)

public class Main {

	public static void main(String [] args) {
		
		double radSmall = 2;
		double radBig = 3;
		double sSmall = Math.PI * Math.pow(radSmall, 2);
		double sBig = Math.PI * Math.pow(radBig, 2);
		double sRing = sBig - sSmall;
		System.out.println("���������� ������ : " + radSmall);
		System.out.println("������� ������ : " + radBig);
		System.out.println("������� ������ : " + sRing);
		
	}
	
}
