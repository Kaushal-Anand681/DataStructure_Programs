package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 5, 7, 9, 3, 2 };
		int[] ans = new int[arr.length];
		ans = buubleSort(arr);
		for (int x : ans) {
			System.out.print(x + " ");
		}
		System.out.println();

	}

	private static int[] buubleSort(int[] arr) {
		// TODO Auto-generated method stub
		if (arr.length == 0) {
			return new int[] {};
		}
		boolean isSorted = false;
		int counter = 0;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < arr.length - 1 - counter; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(i, i + 1, arr);
					isSorted = false;
				}
			}
			counter++;
		}
		return arr;

	}

	private static void swap(int i, int j, int[] arr) {
		// TODO Auto-generated method stub
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;

	}

}
