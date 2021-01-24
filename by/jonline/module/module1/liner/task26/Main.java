package by.jonline.module.module1.liner.task26;

//Найти площадь треугольника, две стороны которого равны a и b, а угол между ними y

public class Main {

	public static void main(String[] args) {
		
		double a = 3;
		double b = 4;
		double gamma = 45;
		double radGamma = Math.toRadians(gamma);
		double s = ((a * b) / 2) * Math.sin(radGamma);
		
		System.out.println("Сторона а : " + a);
		System.out.println("Сторона b : " + b);
		System.out.println("Угол гамма между сторонами а и b : " + gamma);
		System.out.println("Площадь треугольника : " + s);
		

	}

}
