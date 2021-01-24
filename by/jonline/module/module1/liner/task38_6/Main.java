package by.jonline.module.module1.liner.task38_6;

//Для данной области сосавть линейную программу, которая печатает true, если точка с координатами(x,y)
//принадлежит закрашенной области, и false - в противном случае
public class Main {

	public static void main(String[] args) {
		
		double x = (-2);
		double y = 2;	//координаты
		
		boolean result;
		
		result = ((y <= 4) && (y > 0) && (x >= (-2)) && (x <= 2)) ||	//закрашенная область при y > 0
						 (y >= (-4)) && (y <= 0) && (x >= (-4)) && (x <= 4);	//закрашенная область при y <= 0;
		
		System.out.println(result);

	}

}
