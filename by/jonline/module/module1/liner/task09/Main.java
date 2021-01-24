package by.jonline.module.module1.liner.task09;

//¬ычислить значение выражени€ по формуле (a/c)*(b/d)-(((a*b)- c)/ c * d)
//(¬се переменные принимают действительные значени€)

public class Main {

	public static void main(String[] args) {
		
		final double a = 2;
		final double b = 3;
		final double c = 4;
		final double d = 5;
		
		double result = (a/c)*(b/d)-(((a*b)- c)/ c * d);
		
		System.out.println(result);
		

	}

}
