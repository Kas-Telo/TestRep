package by.jonline.module4.class_and_object.task08;

public class SortCustomerList {
	
	public void inAlphabetOrder(String[] customerNames) {
		for(int i = 1; i < customerNames.length; i++) {
			String addVar;
			int j;
			
			addVar = customerNames[i];
			j = i;
			
			while(j > 0 && compare(customerNames[j - 1], addVar) > 0) {
				customerNames[j] = customerNames[j - 1];
				j--;
			}
			customerNames[j] = addVar;
		}
	}
	
	private int compare(String s1, String s2) {
		int strLength1;
		int strLength2;
		
		String strLow1;
		String strLow2;
		
		strLength1 = s1.length();
		strLength2 = s2.length();
		
		strLow1 = s1.toLowerCase();
		strLow2 = s2.toLowerCase();
		
		char[] ch1 = new char[strLength1];
		char[] ch2 = new char[strLength2];
		
		int exitCondition = 0;
		
		initCharArr(ch1, strLow1);
		initCharArr(ch2, strLow2);
		
		if(ch1.length <= ch2.length) {
			exitCondition = ch1.length;
		}else {
			exitCondition = ch2.length;
		}
		int j = 0;
		for(int i = 0; i < exitCondition && j < exitCondition; i++, j++) {
			if(ch1[i] == ' ') {
				i++;
			}
			
			if(ch2[j] == ' ') {
				j++;
			}
			
			if(ch1[i] > ch2[j]) return 1;
			else if(ch1[i] == ch2[i]) continue;
			else break;
			
		}
		
		return -1;
	}
	
	private void initCharArr(char[] ch, String str) {
		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
		}
	}

}
