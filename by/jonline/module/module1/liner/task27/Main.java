package by.jonline.module.module1.liner.task27;

//Дано значение а. Не используя функций и операций, кроме умножения, получить
// значение a^8 за три оперции и a^10 за четыре операции

public class Main {

	public static void main(String[] args) {
		
		double a = 2;
		double b, c, d, f;
		double res1, res2;;
		
		b = a * a;
		c = b * b;
		d = c * c;
		res1 = d;
		
		System.out.println(res1);
		
		b = a * a;		//2я степень
		c = b * b;		//4я степень
		d = c * c;		//8я степень
		f = d * b;		//10я степень
		res2 = f;
		
		System.out.println(res2);

		
	}

}
