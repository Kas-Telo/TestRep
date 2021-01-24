package by.jonline.module.module1.liner.task28;

//Составить программу перевода радианной меры угла в градусы, минуты и секунды	

public class Main {

	public static void main(String[] args) {
		
		final int SECOND_IN_RADIAN = 206265;				//кол-во секунд в 1 градусе
		final int SECOND_IN_DEGREE = 3600;					//кол-во секунд в 1 градусе
		final int MINUTE_IN_DEGREE = 60;					//кол-во минут в градусе
		
		double radian = 1;
		
		double degree = (SECOND_IN_RADIAN * radian) / SECOND_IN_DEGREE;
		double minute = ((SECOND_IN_RADIAN * radian) % SECOND_IN_DEGREE) / MINUTE_IN_DEGREE;
		double second = ((SECOND_IN_RADIAN * radian) % SECOND_IN_DEGREE) % MINUTE_IN_DEGREE;
		
		System.out.println((int)radian + "рад."  + " = " + (int)degree + "гр. " + (int)minute + "' " + (int)second + "\""   );
		
		

	}

}
