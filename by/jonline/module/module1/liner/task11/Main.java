package by.jonline.module.module1.liner.task11;

//Вычислить периметр и площадь прямоугольного треугольника по длинам a и b двух катетов

public class Main {

	public static void main(String[] args) {
		
		double a = 3, b = 4;
		double s = (3 * 4) / 2;
		double c = Math.sqrt((a*a)  + (b*b)); //гипотенуза
		double p = a + b + c;
		
		System.out.println("S треугольнака равна " + s);
		System.out.println("P Треугольника равна " + p);

	}

}
