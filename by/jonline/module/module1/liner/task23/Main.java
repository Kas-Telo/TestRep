package by.jonline.module.module1.liner.task23;

//Найти площадь кольца, внутренний радиус которого равен r, а внешний - R(R>r)

public class Main {

	public static void main(String [] args) {
		
		double radSmall = 2;
		double radBig = 3;
		double sSmall = Math.PI * Math.pow(radSmall, 2);
		double sBig = Math.PI * Math.pow(radBig, 2);
		double sRing = sBig - sSmall;
		System.out.println("Внутренний радиус : " + radSmall);
		System.out.println("Внешний радиус : " + radBig);
		System.out.println("Площадь кольца : " + sRing);
		
	}
	
}
