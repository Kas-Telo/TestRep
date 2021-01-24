package by.jonline.module.module1.cycle.task06;


//Вывести на экран соответствия между смволами и их численными обозначениями
//в памяти компьютера 

public class Main {

	public static void main(String[] args) {
		
		for (int i = 32; i < 56; i++) {		//цыкл вывода строк с корректной нумерацией
			
			System.out.println(			//вывод первой строки таблицы
				i + ") " + ((char)i) + "  " + Integer.toBinaryString(((char)i)) + "  |"
				+ (i+24) + ") " + ((char)(i + 24)) + "  " + Integer.toBinaryString(((char)(i + 24))) + "  |" 
				+ (i+48) + ") " + ((char)(i + 48)) + "  " + Integer.toBinaryString(((char)(i + 48))) + "  |"
				+ (i+72) + ") " + ((char)(i + 72)) + "  " + Integer.toBinaryString(((char)(i + 42))));
		}
	}
}
