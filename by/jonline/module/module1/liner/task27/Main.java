package by.jonline.module.module1.liner.task27;

//���� �������� �. �� ��������� ������� � ��������, ����� ���������, ��������
// �������� a^8 �� ��� ������� � a^10 �� ������ ��������

public class Main {

	public static void main(String[] args) {
		
		double a = 2;
		double b, c, d, f;
		double res1, res2;;
		
		b = a * a;
		c = b * b;
		d = c * c;
		res1 = d;
		
		System.out.println(res1);
		
		b = a * a;		//2� �������
		c = b * b;		//4� �������
		d = c * c;		//8� �������
		f = d * b;		//10� �������
		res2 = f;
		
		System.out.println(res2);

		
	}

}
