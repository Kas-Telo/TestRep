package by.jonline.module.module1.cycle.task04;

//��������� ��������� ������������ ��������� ������ ������� �����

public class Main {

	public static void main(String[] args) {
		
		long multiplicationOfSquare = 1;
		
		for(int i = 1; i <= 200; i++) {
			
			multiplicationOfSquare *=  Math.pow(i, 2);
		}
		
		System.out.println("������������ ��������� ������ ������� ����� ����� " + multiplicationOfSquare);

	}
}
