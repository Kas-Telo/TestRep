package by.jonline.module.module1.branching.task01;
//Даны два угла треугольника (в градусах). Определить существет ли такой треугольник,

//и если да, то будет ли он прямоугольным

public class Main {

	public static void main(String[] args) {

		double angleAlpha = 120;
		double angleBetta = 45;

		if ((angleAlpha == 90 && angleBetta < 90) || (angleBetta == 90 && angleAlpha < 90)
				|| (angleAlpha + angleBetta == 90)) {

			System.out.println("Такой треугольник существует и является прямоугольным");

		} else if ((angleAlpha + angleBetta) < 180) {

			System.out.println("Такой треугольник существует но не является прямоугольным");

		} else {

			System.out.println("Такотого треугольника не существет!");

		}
	}
}