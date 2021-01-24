package by.jonline.module4.class_and_object.task07;

public class Triangle {
	public Point point1 = new Point();
	public Point point2 = new Point();
	public Point point3 = new Point();
	
	private double side1;
	private double side2;
	private double side3;

	public Triangle() {

	}

	public double getSide1() {
		return side1;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public void setSide3(double side3) {
		this.side3 = side3;
	}

	/*public static Triangle createTriangle(int side1, int side2, int side3) {
		Triangle triangle = null;
		
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			System.out.format("Треугольника со сторонами %d, %d и %d не существует!\n", side1, side2, side3);
			System.out.println("Сторона треугольника не может быть меньше либо равной нуль.");
			return triangle;
		}

		if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
			System.out.format("Треугольника со сторонами %d, %d и %d не существует!\n", side1, side2, side3);
			System.out.println("Сумма двух сторон треугольника не может быть меньше третьей стороны.");
			return triangle;
		}
		
		triangle = new Triangle();
		triangle.side1 = side1;
		triangle.side2 = side2;
		triangle.side3 = side3;
		System.out.format("Треугольника со сторонами %d, %d и %d\n", side1, side2, side3);

		return triangle;

	}*/
}
