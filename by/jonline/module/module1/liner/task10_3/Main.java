package by.jonline.module.module1.liner.task10_3;

//��������� �������� ��������� �� ������� 
//(Math.sin(x) + Math.cos(y)) / (Math.sin(x) - Math.cos(y)) * Math.tan(x * y)
//(��� ���������� ��������� �������������� ��������)

public class Main {

	public static void main(String[] args) {
		
		double x = Math.PI;
		double y = Math.PI / 2;
		double result;
		
		result = (Math.sin(x) + Math.cos(y)) / (Math.sin(x) - Math.cos(y)) * Math.tan(x * y);
		
		System.out.println("��������� �������� ���������: (Math.sin(x) + Math.cos(y)) / (Math.sin(x) - Math.cos(y)) * Math.tan(x * y)");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("���������: " + result);

	}

}
