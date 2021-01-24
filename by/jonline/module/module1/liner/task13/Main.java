package by.jonline.module.module1.liner.task13;

//Заданы координаты трех вершин треугольника(x1, y1)(x2, y2)(x3, y3).
//Найти его периметр и площадь

public class Main {

	public static void main(String[] args) {
		double x1 = 2, y1 = 2;
		double x2 = 0, y2 = -4;
		double x3 = -2, y3 = 2;
		double a,b,c;
		a = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		b = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2));
		c = Math.sqrt(Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2));
		
		double perimetr = a + b + c;
		double p = (a + b + c)/2;
		double h = (2 * Math.sqrt(p * (p-a)*(p-b)*(p-c))) / a;
		double s = (a * h) / 2;
		System.out.println("Периметр равен " + perimetr);
		System.out.println("Площадь равна " + s);
	}

}
