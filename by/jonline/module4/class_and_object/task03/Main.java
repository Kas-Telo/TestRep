package by.jonline.module4.class_and_object.task03;

/*
 *	Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, 
 *	успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. 
 *  Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Main {

	public static void main(String[] args) {
		Student[] student = new Student[10];
		
		student[0] = new Student("Иванов И.И.", 1, new int[] {9, 10, 8, 9, 10});
		student[1] = new Student("Чекунов А.Н.", 3, new int[] {9, 10, 10, 9, 10});
		student[2] = new Student("Лепина В.А.", 3, new int[] {9, 10, 8, 9, 10});
		student[3] = new Student("Григорьев В.Н.", 5, new int[] {9, 7, 8, 9, 10});
		student[4] = new Student("Прыть А.В.", 3, new int[] {9, 10, 10, 9, 10});
		student[5] = new Student("Кулешов И.С.", 5, new int[] {9, 10, 10, 9, 10});
		student[6] = new Student("Корнеев М.А.", 2, new int[] {9, 10, 7, 9, 10});
		student[7] = new Student("Брошко К.О.", 2, new int[] {9, 10, 8, 9, 8});
		student[8] = new Student("Кушнеренко А.В.", 1, new int[] {9, 8, 10, 9, 10});
		student[9] = new Student("Колюта М.А.", 4, new int[] {9, 10, 10, 9, 10});
		
		for(int i = 0; i < student.length; i++) {
			student[i].theBestProgress();
		}
	}

}
