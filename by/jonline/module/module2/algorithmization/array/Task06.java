package by.jonline.module.module2.algorithmization.array;

//������ ������������������ ����� N ������������ �����. ��������� ����� �����,
//���������� ������ ������� �������� �������� �������.

public class Task06 {

	public static void main(String[] args) {

		final int N = 18;
		
		double[] arr = new double[N];
		boolean[] arr1 = new boolean[N];
		
		int counter;		//�������������� ������� �������� �������
		double sum = 0;
		
		initArray(arr);
		System.out.println("������������������ �����:");
		printArray(arr);
		
		System.out.println("\n������� ���������� ������ � �� ��������:");
		
		for(int i = 2; i < N; i++) {
			if(arr1[i] == false) {
				
				System.out.println(i + " = " + arr[i]);
				sum += arr[i];
				
				counter = i;
				while(counter < N) {
					
					counter += i;
					
					if(counter >= N) {
						break;
					}else {
						arr1[counter] = true;
					}	
				}
			}
		}
		System.out.println("����� ���� �����: " + sum);
	}
	
	private static void initArray(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i * 0.25;
		}
	}

	private static void printArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
