package by.jonline.module.module1.liner.task22_5;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
//Вывести данное значение длительности в часах, минтах и секундах в следующей форме
//HHч MMмин SSс

public class Main {

	public static void main(String[] args) {
		int secIn;
		int hour;
		int minute;
		int secOut;
		
		int secInHour = 3600;
		int minInHour = 60;
		

		secIn = 3700;
		hour = secIn / secInHour;
		minute =  (secIn % secInHour) / minInHour;
		secOut = (secIn % secInHour) % minInHour;
		
		System.out.print(secIn + "с = ");
		System.out.print(hour + "ч ");
		System.out.print(minute + "мин ");
		System.out.print(secOut+ "c");

	}

}
