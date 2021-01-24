package by.jonline.module.module1.branching.task02;

//Найти max{min(a,b), min(c,d)}

public class Main {

	public static void main(String[] args) {
		
		double a = 100;
		double b = 200;
		double c = 300;
		double d = 400;
		
		System.out.println(max(min(a, b), min(c, d)));

	}
	
	private static double min(double a, double b) {
		
		return a < b ? a : b;
		
	}
	
	private static double max(double a, double b) {
		
		return b > a ? b : a;
		
	}
}
