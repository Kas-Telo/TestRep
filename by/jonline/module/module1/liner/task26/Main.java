package by.jonline.module.module1.liner.task26;

//����� ������� ������������, ��� ������� �������� ����� a � b, � ���� ����� ���� y

public class Main {

	public static void main(String[] args) {
		
		double a = 3;
		double b = 4;
		double gamma = 45;
		double radGamma = Math.toRadians(gamma);
		double s = ((a * b) / 2) * Math.sin(radGamma);
		
		System.out.println("������� � : " + a);
		System.out.println("������� b : " + b);
		System.out.println("���� ����� ����� ��������� � � b : " + gamma);
		System.out.println("������� ������������ : " + s);
		

	}

}
