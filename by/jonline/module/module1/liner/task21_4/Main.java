package by.jonline.module.module1.liner.task21_4;

//Дано число R вида nnn.ddd(по три цифровых разряда разряда в дробной  целой частях).
//Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Main {

	public static void main(String[] args) {
		double r = 123.678;
		int d;
		int n;
		
		String str;
		
		d =(int)( r * 1000 % 1000);
		n = (int)r;
		
		str = d + "." + n;
		
		System.out.println("Число : " + r );
		r = Double.parseDouble(str);
		System.out.println("Число с заменой : " + r );
	}

}
