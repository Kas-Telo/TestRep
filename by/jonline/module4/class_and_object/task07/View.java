package by.jonline.module4.class_and_object.task07;

public class View {
	private TriangleLogic logic = new TriangleLogic();
	
	public void square(Triangle triangle) {
		double square;
		square = logic.square(triangle);
		
		System.out.format("Площадь треугольника: %.2f\n", square);
	}
	
	public void perimeter(Triangle triangle) {
		double perimeter;
		perimeter = logic.perimeter(triangle);
		
		System.out.format("Периметр треугольника: %.2f\n", perimeter);
	}
	
	public void medianIntersectionPoint(Triangle triangle) {
		double x = logic.medianIntersectionPoint(triangle).getX();
		double y = logic.medianIntersectionPoint(triangle).getY();
		
		System.out.printf("Точка пересечения медиан этого треугольника x = %.2f y = %.2f\n", x, y);	
		
	}

}