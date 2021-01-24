package by.jonline.module4.class_and_object.task06;

public class Show {
	public void messegeLn(String messege) {
		System.out.println(messege);
	}
	
	public void messege(String messege) {
		System.out.print(messege);
	}
	
	public void time(int hour, int minute, int second) {
		System.out.format("%s:%s:%s", unitOfTime(hour), unitOfTime(minute), unitOfTime(second));
		System.out.println();
	}
	
	private String unitOfTime(int value) {
		if(value >= 0 && value < 10) {
			return "0" + value;
		}

		return "" + value;
	}

}
