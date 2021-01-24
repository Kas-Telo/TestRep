package by.jonline.module.module2.algorithmization.array;

/*��� ������������� ������ � ����������� ��������� �.
����� ������, �������� �� ���� ������ ������
������� (�������������� �������� ��������� ������).
����������. �������������� ������ �� ������������.
*/

public class Task10 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 2, 4, -1, 9, -5, 7, 10 };

		System.out.println("���� ������:");
		printArray(arr);
		
		System.out.println("������ ����� ������:");
		compressArray(arr);
		printArray(arr);

	}
	

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	
	private static void compressArray(int[] arr) {
		int j = 1;
		for (int i = 0; i < arr.length; i++) {
			if((i + 1) == arr.length) {
				break;
			}else 
			if (((i + 1) % 2) == 0) {
				arr[j] = arr[i + 1];
				j++;
			}
		}
		for(int i = (arr.length-1); i >= j; i--) {
			arr[i] = 0;
		}
	}
}
