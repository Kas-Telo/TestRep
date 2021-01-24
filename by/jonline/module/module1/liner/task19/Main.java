package by.jonline.module.module1.liner.task19;

//Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту,
// радиусы вписанной и описанной окружности.

public class Main {

	public static void main(String[] args) {
		
		double a = 4;
		double h = (a * Math.sqrt(3)) / 2;
		double rOpis = (h * 2) / 3;
		double rVpis = rOpis / 2;
		System.out.println("Сторона равностороннего треугольника: " + a);
		System.out.println("Радиус описанной окружности: " + rOpis);
		System.out.println("Радиус вписанной окружности: " + rVpis);
		
	}

}
