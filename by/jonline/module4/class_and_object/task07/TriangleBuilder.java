package by.jonline.module4.class_and_object.task07;

public class TriangleBuilder {
	private Point point1 = null;
	private Point point2 = null;
	private Point point3 = null;
	
	private double side1;
	private double side2;
	private double side3;
	
	public TriangleBuilder point1(int x , int y) {
		point1 = new Point();
		point1.setX(x);
		point1.setY(y);
		
		return this;
	}
	
	public TriangleBuilder point2(int x , int y) {
		point2 = new Point();
		point2.setX(x);
		point2.setY(y);
		return this;
	}
	
	public TriangleBuilder point3(int x , int y) {
		point3 = new Point();
		point3.setX(x);
		point3.setY(y);
		return this;
	}
	
	private double buildSide(Point point1, Point point2) {
		double side;
		double x1;
		double x2;
		double y1;
		double y2;
		
		x1 = point1.getX();
		x2 = point2.getX();
		y1 = point1.getY();
		y2 = point2.getY();
		
		side = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
		return side;
	}
	
	public Triangle build() {
		Triangle triangle = null;
		
		if(point1 == null || point2 == null|| point3 == null) {
			System.out.println("Заданы не все точки.");
			System.out.println("Треугольник построить невозможно!");
			
			return triangle;
		}
		
		side1 = buildSide(point1, point2);
		side2 = buildSide(point2, point3);
		side3 = buildSide(point1, point3);
		
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			System.out.format("Треугольника со сторонами %.2f, %.2f и %.2f не существует!\n", side1, side2, side3);
			System.out.println("Сторона треугольника не может быть меньше либо равной нуль.");
			return triangle;
		}
		
		if(side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
			System.out.format("Треугольника со сторонами %.2f, %.2f и %.2f не существует!\n", side1, side2, side3);
			System.out.println("Сумма двух сторон треугольника не может быть меньше третьей стороны.");
			return triangle;
		}
		
		triangle = new Triangle();
		
		triangle.point1.setX(point1.getX());
		triangle.point2.setX(point2.getX());
		triangle.point3.setX(point3.getX());
		triangle.point1.setY(point1.getY());
		triangle.point2.setY(point2.getY());
		triangle.point3.setY(point3.getY());
		
		
		triangle.setSide1(side1);
		triangle.setSide2(side2);
		triangle.setSide3(side3);
		System.out.format("Треугольника со сторонами %.2f, %.2f и %.2f\n",
								triangle.getSide1(), triangle.getSide2(), triangle.getSide3());
		
		return triangle;
	}
}
