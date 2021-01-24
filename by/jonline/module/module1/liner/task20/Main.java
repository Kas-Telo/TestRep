package by.jonline.module.module1.liner.task20;

//Известна длина окружности. Найти площадь круга

public class Main {

	public static void main(String[] args) {
		
		double c = 13;
		double r = c / (2 * Math.PI);
		double s = Math.PI * Math.pow(r, 2);
		System.out.println("Длина окружнасти : " + c);
		System.out.println("Площадь круга : " + s);

	}

}
