package by.jonline.module.module2.algorithmization.decomposition;

/* Даны числа X, Y, Z, Т — длины сторон четырехугольника.
 * Написать метод(методы) вычисления его площади, 
 * если угол между сторонами длиной X и Y— прямой.
 */

public class Task09 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int z = 8;
		int t = 6;
		
		System.out.format("Дан четырёхугольник со сторонами %d, %d, %d и %d%n", x, y, z, t);
		System.out.format("Его площадь равна %.2f",
							              area(semiPerimeter(x, y, z, t), x, y, z, t));
		

	}
	
	static double area(double p, int x, int y, int z, int t) {
		double area;
		
		area = Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
		
		return area;
	}
	
	static double semiPerimeter(int x, int y, int z, int t) {
		int p;
		p = (x + y + z + t) / 2;
		
		return p;
	}


}
