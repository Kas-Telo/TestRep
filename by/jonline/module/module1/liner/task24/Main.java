package by.jonline.module.module1.liner.task24;

//����� ������� �������������� �������� � ����������� a � b � ����� alpha
// ��� ������� ��������� �

public class Main {

	public static void main(String[] args) {
		
		double a = 10;
		double b = 8;
		double alpha = 50;
		double rad = Math.toRadians(alpha);
		double s = ((Math.pow(a, 2) - Math.pow(b, 2)) / 2) * Math.tan(rad);
		
		System.out.println("������� � : " + a);
		System.out.println("������� b : " + b);
		System.out.println("���� alpha ��� ��������� a : " + alpha);
		System.out.println("������� �������� : " + s);

	}

}
