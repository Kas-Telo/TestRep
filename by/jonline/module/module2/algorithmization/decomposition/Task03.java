package by.jonline.module.module2.algorithmization.decomposition;

/*Вычислить площадь правильного шестиугольника со стороной а,
 *используя метод вычисления площади треугольника.
 */

public class Task03 {

	public static void main(String[] args) {
		double a = 4;
		
		System.out.format("Площадь правильного шестиугольника со стороной " 
							+ a + " = %.2f", squareOfRegularHexagon(a));
	}
	
	static double squareOfTringle(double a) {
		double square;
		
		square = (Math.pow(2, a) * Math.sqrt(3)) / 4;
		
		return square;
	}
	
	static double squareOfRegularHexagon(double a) {
		double square;
		
		square = squareOfTringle(a) * 6;
		
		return square;
	}

}
