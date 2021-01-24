package by.jonline.module.module1.cycle.task03;

//Найти сумму квадратов первых ста чисел

public class Main {

	public static void main(String[] args) {
		
		double sumOfSquare = 0;
		
		for(int i = 1; i <= 100; i++) {
			sumOfSquare = sumOfSquare + Math.pow(i, 2);
		}
		
		System.out.println("Сумма квадратов первых ста чисел равна " + sumOfSquare);

	}

}
