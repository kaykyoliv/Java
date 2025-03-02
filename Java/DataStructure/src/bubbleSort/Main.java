package bubbleSort;

public class Main {

	public static void main(String[] args) {
		int[] array = { 1, 5, 4, 2, 6, 7, 9, 3, 8 };

		BubbleSort(array);

		for (int i : array) {
			System.out.print(i);
		}

	}

	private static void BubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

	}

}
