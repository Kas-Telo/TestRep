package by.jonline.module.module1.liner.task24;

//Найти площадь равнобедренной трапеции с основаниями a и b и углом alpha
// при большем основании а

public class Main {

	public static void main(String[] args) {
		
		double a = 10;
		double b = 8;
		double alpha = 50;
		double rad = Math.toRadians(alpha);
		double s = ((Math.pow(a, 2) - Math.pow(b, 2)) / 2) * Math.tan(rad);
		
		System.out.println("Сторона а : " + a);
		System.out.println("Сторона b : " + b);
		System.out.println("Угол alpha при основании a : " + alpha);
		System.out.println("Площадь трапеции : " + s);

	}

}
