package by.jonline.module.module1.cycle.task02;

//Вычислить значение функции на отрезке [a, b] с шагом h
// y = x, при x > 2; y = (-x), при x <= 2

public class Main {

	public static void main(String[] args) {
		
		double a = -2, b = 5;
		double h = 1;
		
		double x, y;
		
		System.out.println("y = x, при x > 2; y = (-x), при x <= 2\n");
		
		for(x = a; x <= b; x += h ) {				//Выполнение цикла [a, b] с шагом h
			if(x > 2) {		//условие функции "y"
				y = x;
				
				System.out.println("y = " + y + ", при x = " + x);
				
			}else if(x == 0) {			
				y = 0;
				
				System.out.println("y = " + y + ", при x = " + x);
			
			}else {
				y = -(x);
				
				System.out.println("y = " + y + ", при x = " + x);
			}
		}
	}
}
