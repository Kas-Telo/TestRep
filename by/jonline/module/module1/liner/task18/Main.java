package by.jonline.module.module1.liner.task18;

//Дана длина куба. Найти площадь грани s1, площадь полной поверхности s2, объем куба v

public class Main {

	public static void main(String[] args) {
		
		int a = 3;
		int s1 = a * a;
		int s2 = s1 * 6;
		int v = a * a * a;
		System.out.println("Длина ребра куба : " + a);
		System.out.println("Площадь грани куба : " + s1);
		System.out.println("Площадь полной поверхности куба : " + s2);
		System.out.println("Объем куба : " + v);

	}

}
