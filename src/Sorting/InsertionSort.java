package Sorting;

public class InsertionSort {

	public static int[] insertionSort(int[] array) {
		if (array.length == 0) {
			return new int[] {};
		}
		for (int i = 1; i < array.length; i++) {
			int j = i;
			while (j > 0 && array[j] < array[j - 1]) {
				swap(j, j - 1, array);
				j = j-1;
			}
		}
		return array;
	}

	private static void swap(int j, int i, int[] array) {

		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
}
