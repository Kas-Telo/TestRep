package by.jonline.module4.class_and_object.task07;

public class TriangleLogic {
	public double square(Triangle triangle) {
		double side1;
		double side2;
		double side3;
		double semiPerimeter;
		double square;
		
		side1 = triangle.getSide1();
		side2 = triangle.getSide2();
		side3 = triangle.getSide3();
		semiPerimeter = (side1 + side2 + side3) / 2;
		
		square = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
		
		return square;
	}
	
	public double perimeter(Triangle triangle) {
		double side1;
		double side2;
		double side3;
		double perimeter;
		
		side1 = triangle.getSide1();
		side2 = triangle.getSide2();
		side3 = triangle.getSide3();
		perimeter = side1 + side2 + side3;
		
		return perimeter;
	}
	
	public Point medianIntersectionPoint(Triangle triangle) {
		Point pointCross = new Point();
		double amountOfPoints = 3;
		
		pointCross.setX((triangle.point1.getX() + triangle.point2.getX() + triangle.point3.getX()) / amountOfPoints);
		pointCross.setY((triangle.point1.getY() + triangle.point2.getY() + triangle.point3.getY()) / amountOfPoints);
		
		return pointCross;
	}
}
