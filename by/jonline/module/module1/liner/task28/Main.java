package by.jonline.module.module1.liner.task28;

//��������� ��������� �������� ��������� ���� ���� � �������, ������ � �������	

public class Main {

	public static void main(String[] args) {
		
		final int SECOND_IN_RADIAN = 206265;				//���-�� ������ � 1 �������
		final int SECOND_IN_DEGREE = 3600;					//���-�� ������ � 1 �������
		final int MINUTE_IN_DEGREE = 60;					//���-�� ����� � �������
		
		double radian = 1;
		
		double degree = (SECOND_IN_RADIAN * radian) / SECOND_IN_DEGREE;
		double minute = ((SECOND_IN_RADIAN * radian) % SECOND_IN_DEGREE) / MINUTE_IN_DEGREE;
		double second = ((SECOND_IN_RADIAN * radian) % SECOND_IN_DEGREE) % MINUTE_IN_DEGREE;
		
		System.out.println((int)radian + "���."  + " = " + (int)degree + "��. " + (int)minute + "' " + (int)second + "\""   );
		
		

	}

}
