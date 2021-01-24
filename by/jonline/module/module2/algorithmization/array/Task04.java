package by.jonline.module.module2.algorithmization.array;

//���� �������������� ����� a1, a2, aN. �������� ������� ���������� � ���������� �������.

public class Task04 {

	public static void main(String[] args) {
		int indexMin = 0;
		int indexMax = 0;
		int n;		//������������� ����������

		int[] arr = { 4, 3, 8, 5, 1 };

		System.out.print("���� ������������������ �����: ");
		printArray(arr);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[indexMin]) {
				indexMin = i;
			}
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[indexMax]) {
				indexMax = i;
			}
		}
		
		System.out.println("���������� �������: " + arr[indexMin]);
		System.out.println("���������� �������: " + arr[indexMax]);

		n = arr[indexMax];
		arr[indexMax] = arr[indexMin];
		arr[indexMin] = n;

		System.out.print("������������������ ����� ������ �� �������: ");
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
