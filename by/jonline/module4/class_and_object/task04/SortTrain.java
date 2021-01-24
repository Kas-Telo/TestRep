package by.jonline.module4.class_and_object.task04;

public class SortTrain {

	public SortTrain() {

	}

	public void byNumber(Train[] train) {
		for (int i = 1; i < train.length; i++) {
			Train addVar;
			int j;
			addVar = train[i];
			j = i;

			while (j > 0 && train[j - 1].getTrainNumber() > addVar.getTrainNumber()) {
				train[j] = train[j - 1];
				j--;
			}

			train[j] = addVar;
		}
	}

	public void byDestination(Train[] trains) {

		for (int i = 1; i < trains.length; i++) {
			Train addVar;
			int j;

			addVar = trains[i];
			j = i;

			while (j > 0 && theRightLineShouldBeToTheLeft(trains[j - 1].getDestination(), addVar.getDestination())) {
				trains[j] = trains[j - 1];
				j--;
			}

			trains[j] = addVar;
		}
		
		sortByDepTime(trains);
	}

	private boolean theRightLineShouldBeToTheLeft(String str1, String str2) {
		String strLow1;
		String strLow2;

		strLow1 = str1.toLowerCase();
		strLow2 = str2.toLowerCase();

		char[] ch1 = new char[str1.length()];
		char[] ch2 = new char[str2.length()];

		initCharArr(ch1, strLow1);
		initCharArr(ch2, strLow2);

		int exitCondition = 0;

		if (ch1.length <= ch2.length) {
			exitCondition = ch1.length;
		} else {
			exitCondition = ch2.length;
		}

		for (int i = 0; i < exitCondition; i++) {

			if (ch1[i] < ch2[i]) {
				break;
			}
			if ((int) ch1[i] > (int) ch2[i]) {
				return true;
			}
		}
		
		return false;
	}

	private void initCharArr(char[] ch, String str) {
		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
		}
	}
	
	private void sortByDepTime(Train[] train) {
		int start;
		int finish = 0;

		for (int i = 0; i < train.length; i++) {
			if (train[i].getDestination() != train[i + 1].getDestination()) {
				continue;
			}
			
			for (start = i; start < train.length - 1 && train[start].getDestination() == train[start + 1].getDestination(); start++) {
				finish = start + 1;
			}
			start = i + 1;
			
			while(start <= finish) {
				Train addVar;
				int j;
				int zeroPosition; 

				addVar = train[start];
				j = start;
				zeroPosition = start - 1;

				while (j > zeroPosition && train[j - 1].getDepartureTime() > addVar.getDepartureTime()) {
					train[j] = train[j - 1];
					j--;
				}

				train[j] = addVar;
				start++;
			}
			
			i = finish;
		}
	}
}
