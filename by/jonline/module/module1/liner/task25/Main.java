package by.jonline.module.module1.liner.task25;

//��������� ����� ����������� ��������� ax^2 + bx + c = 0 c ��������� ��������������
// a, b, � � (�������������� ��� �!=0  � ��� ������������ �� �����������)

public class Main {

	public static void main(String[] args) {
		
		double x1, x2;
		double a = 3;
		double b = 9;
		double c = 5;
		double d = Math.pow(b, 2) - (4 * a * c);
		x1 = (- (b) - Math.sqrt(d)) / (2 * a);
		x2 = (- (b) + Math.sqrt(d)) / (2 * a);
		System.out.println("����� ����� ����������� ���������� : ax^2 + bx + c = 0");
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		

	}

}
