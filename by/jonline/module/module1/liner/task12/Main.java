package by.jonline.module.module1.liner.task12;

//���������� ���������� ����� ���� ������� � ������� ������������(x1,y1) � (x2,y2)

public class Main {

	public static void main(String[] args) {
		double x1 = 1, y1 = -1;
		double x2 = -1, y2 = 2;
		double dlinaOtrezka;
		dlinaOtrezka = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		System.out.println(dlinaOtrezka);

	}

}
