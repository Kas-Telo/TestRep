package by.jonline.module.module1.liner.task38_6;

//��� ������ ������� ������� �������� ���������, ������� �������� true, ���� ����� � ������������(x,y)
//����������� ����������� �������, � false - � ��������� ������
public class Main {

	public static void main(String[] args) {
		
		double x = (-2);
		double y = 2;	//����������
		
		boolean result;
		
		result = ((y <= 4) && (y > 0) && (x >= (-2)) && (x <= 2)) ||	//����������� ������� ��� y > 0
						 (y >= (-4)) && (y <= 0) && (x >= (-4)) && (x <= 4);	//����������� ������� ��� y <= 0;
		
		System.out.println(result);

	}

}
