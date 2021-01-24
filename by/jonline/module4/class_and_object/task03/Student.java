package by.jonline.module4.class_and_object.task03;

public class Student {
	private String name;
	private int group = 0;
	private int[] progress;
	
	public Student(String name, int group, int[] progress) {
		this.name = name;
		this.group = group;
		this.progress = progress;
	}
	
	public void theBestProgress() {
		int counter = 0;
		
		for(int i = 0; i < progress.length; i++) {
			if(progress[i] == 9 || progress[i] == 10) {
				counter++;
			}
		}
		
		if(counter == progress.length) {
			System.out.println(name + " номер групы: " + group);
		}
	}

}
