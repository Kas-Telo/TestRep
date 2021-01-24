package by.jonline.module.module1.branching.task04;

//Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
//Определить пройдёт ли кирпич через отверстие

public class Main {

	public static void main(String[] args) {
		double a = 12;
		double b = 5;
		
		double x = 5;
		double y = 12;
		
		System.out.println("Размеры отверстия: " + a + " на " + b);
		
		if((a == x || b == x) && (a == y || b == y)) {
			System.out.println("Кирпич проходит через отверстие!");
		}else {
			System.out.println("Кирпич не проходит через отверстие!");
		}

	}

}
