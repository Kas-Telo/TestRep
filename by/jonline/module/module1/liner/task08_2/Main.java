package by.jonline.module.module1.liner.task08_2;

//Найдите значение выражения ((b + sqrt(b^2 + 4ac))/2a) - (a^3 * c) + b^(-2)
//(Все переменные принимают действительные значения)

public class Main {

	public static void main(String[] args) {
		final double a = 7;
		final double b = 3;
		final double c = 4.2;
		double result;	
		
		System.out.println("Найдите значение выражения ((b + sqrt(b^2 + 4ac))/2a) - (a^3 * c) + b^(-2)");
		
		result = b + (Math.sqrt((Math.pow(3, 2)) + (4 * a * c)));
		result = result / (2 * a);
		result = result - (Math.pow(a, 3) * c);
		result = result + (Math.pow(b, (-2)));
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("Значение выражения равно " + result);
		
		
		
	}

}
