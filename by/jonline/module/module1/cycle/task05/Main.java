package by.jonline.module.module1.cycle.task05;

//���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����,
//������ ������� ������ ��� ����� ��������� �.    a(n ������) = (1 / 2^n) + (1 / 3^n)

public class Main {

	public static void main(String[] args) {
		
		double e = 0.9;
		double sum = 0;
		double a;
		
		for (int n = 1; ; n++ ) {
			a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
			
			if(Math.abs(a) >= e) {
				sum = sum + a;
			}else {
				break;
			}
		}
		
		if(sum != 0) {
			System.out.println("����� ������ ����, ������ ������� ������ e : " + sum);		
		}else {
			System.out.println("��� �� ������ ����� ���� � ������� ������ � !");
		}
	}
}
