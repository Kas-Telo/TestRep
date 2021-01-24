package by.jonline.module.module1.liner.task25;

//Вычислить корни квадратного уравнения ax^2 + bx + c = 0 c заданными коэффициентами
// a, b, и с (предполагается что а!=0  и что дискриминант не отрицателен)

public class Main {

	public static void main(String[] args) {
		
		double x1, x2;
		double a = 3;
		double b = 9;
		double c = 5;
		double d = Math.pow(b, 2) - (4 * a * c);
		x1 = (- (b) - Math.sqrt(d)) / (2 * a);
		x2 = (- (b) + Math.sqrt(d)) / (2 * a);
		System.out.println("Найти корни квадратного уровнаения : ax^2 + bx + c = 0");
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		

	}

}
