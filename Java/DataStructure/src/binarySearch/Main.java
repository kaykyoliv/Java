package binarySearch;

public class Main {

	public static void main(String[] args) {

		int[] array = new int[10000000];
		int target = 777777;

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		

		//System.out.println(Arrays.binarySearch(array, target));
		int index = BinarySearch(array, target);
		
		if(index == -1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found at: " + index);
		}

	}

	private static int BinarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
	

		while (low <= high) {
			int middle = low + (high - low) / 2;
			int value = array[middle];
			
			System.out.println("middle: " + middle);
			
			if (value > target) {
				high = middle - 1;
			}
			else if (value < target) {
				low = middle + 1;
			}
			else return middle;
		}
		return -1;
	}

}
