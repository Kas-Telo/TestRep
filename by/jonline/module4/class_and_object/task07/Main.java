package by.jonline.module4.class_and_object.task07;

/* *
 * Описать класс, представляющий треугольник. 
 * Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.\
 * */

public class Main {

	public static void main(String[] args) {
		View view = new View();
		Triangle triangle = new TriangleBuilder()
				.point1(5, 2)
				.point2(0, -7)
				.point3(-2, 0)
				.build();
		
		if (triangle != null) {
			view.perimeter(triangle);
			view.square(triangle);
			view.medianIntersectionPoint(triangle);
		}
	}
}
