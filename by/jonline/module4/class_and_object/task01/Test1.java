package by.jonline.module4.class_and_object.task01;

/* Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран 
 * и методы изменения этих переменных. Добавьте метод, 
 * который находит сумму значений этих переменных, и метод, 
 * который находит наибольшее значение из этих двух переменных.
 */

public class Test1 {
	private int a = 2;
	private int b = 4;
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getB() {
		return b;
	}
	
	public void printVar(int variable) {
		System.out.println(variable);
	}
	
	public int sumOfVar(int a, int b) {
		return a + b;
	}
	
	public int biggestVar(int a, int b) {
		if(a > b) {
			return a;
		}
		
		return b;
	}
}
