package by.jonline.module.module1.branching.task03;

//Даны три точки А(x1,y1), B(x2,y2) c(x3,y3).Определить будут ли они расположенны на одной прямой

public class Main {

	public static void main(String[] args) {
		double x1 = 1, y1 = 1;
		double x2  = 3, y2 = 1;
		double x3 = 12, y3 = 1;
		
		boolean result;
		
		result = (x2 - x1) * (y3 - y1) == (x3 - x1) * (y2 - y1);
		
		if(result) {
			System.out.println("Все точки лежат на одной прямой!");
		}else {
			System.out.println("Не все точки лежат на одной прямой!");
		}
	}
}
