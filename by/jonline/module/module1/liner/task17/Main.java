package by.jonline.module.module1.liner.task17;

//���� ��� �����. ����� ������� �������������� �����. ������� �������������� �������

public class Main {

	public static void main(String[] args) {
		
		int a = 3, b = 4;
		double avg = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		double gAvg = Math.sqrt(Math.abs(a) * Math.abs(b));
		System.out.println("������� ��������������� ����� "+ a + " � " + b + ": " + avg);
		System.out.println("������� �������������� ������� "+ a + " � " + b + ": " + gAvg);

	}

}
