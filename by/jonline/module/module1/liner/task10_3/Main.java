package by.jonline.module.module1.liner.task10_3;

//Вычислить значение выражения по формуле 
//(Math.sin(x) + Math.cos(y)) / (Math.sin(x) - Math.cos(y)) * Math.tan(x * y)
//(Все переменные принимают действительные значения)

public class Main {

	public static void main(String[] args) {
		
		double x = Math.PI;
		double y = Math.PI / 2;
		double result;
		
		result = (Math.sin(x) + Math.cos(y)) / (Math.sin(x) - Math.cos(y)) * Math.tan(x * y);
		
		System.out.println("Вычислить значение выражения: (Math.sin(x) + Math.cos(y)) / (Math.sin(x) - Math.cos(y)) * Math.tan(x * y)");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Результат: " + result);

	}

}
