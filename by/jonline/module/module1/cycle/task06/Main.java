package by.jonline.module.module1.cycle.task06;


//������� �� ����� ������������ ����� �������� � �� ���������� �������������
//� ������ ���������� 

public class Main {

	public static void main(String[] args) {
		
		for (int i = 32; i < 56; i++) {		//���� ������ ����� � ���������� ����������
			
			System.out.println(			//����� ������ ������ �������
				i + ") " + ((char)i) + "  " + Integer.toBinaryString(((char)i)) + "  |"
				+ (i+24) + ") " + ((char)(i + 24)) + "  " + Integer.toBinaryString(((char)(i + 24))) + "  |" 
				+ (i+48) + ") " + ((char)(i + 48)) + "  " + Integer.toBinaryString(((char)(i + 48))) + "  |"
				+ (i+72) + ") " + ((char)(i + 72)) + "  " + Integer.toBinaryString(((char)(i + 42))));
		}
	}
}
