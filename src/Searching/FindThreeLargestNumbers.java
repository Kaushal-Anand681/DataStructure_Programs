package Searching;

public class FindThreeLargestNumbers {

	public static int[] findThreeLargestNumbers(int[] array) {
		int[] largestArr = { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
		for (int num : array) {
			update(largestArr, num);
		}
		return largestArr;
	}

	public static void update(int[] largestArr, int num) {
		if (num > largestArr[2]) {
			shiftAndUpdate(largestArr, num, 2);
		} else if (num > largestArr[1]) {
			shiftAndUpdate(largestArr, num, 1);
		} else if (num > largestArr[0]) {
			shiftAndUpdate(largestArr, num, 0);
		}

	}

	public static void shiftAndUpdate(int[] largestArr, int num, int idx) {
		for (int x = 0; x <= idx; x++) {
			if (x == idx) {
				largestArr[x] = num;

			} else {
				largestArr[x] = largestArr[x + 1];
			}
		}

	}

}
