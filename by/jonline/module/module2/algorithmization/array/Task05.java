package by.jonline.module.module2.algorithmization.array;

//���� ����� ����� �1, �2...�N. ������� �� ������ ������ �� �����
// ��� ������� aI > I.

public class Task05 {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 4, 3, 1, -2, 1, 4 };

		System.out.print("��� ������: ");
		printArray(arr);
		
		System.out.print("/n����� ��� ������� aI > I: ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i) {
				System.out.print(arr[i] + "  ");
			}
		}
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {

			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}

	}

}
