package FrequentlyAskedProblems;

import java.util.Arrays;

public class SmallestDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = new int[] { -1, 5, 10, 20, 28, 3 };
		int[] arrayTwo = new int[] { 26, 134, 135, 15, 17 };
		int[] ans = new int[2];
		ans = smallestDifference(arrayOne, arrayTwo);
		int difference = ans[0] - ans[1];
		if (difference < 0) {
			difference = difference * -1;
		}
		for (int x : ans) {
			System.out.print(x + " ");
		}
		System.out.println(difference);

	}

	private static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		// TODO Auto-generated method stub
		int idxOne = 0;
		int idxTwo = 0;
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int smallest = Integer.MAX_VALUE;
		int current = Integer.MAX_VALUE;
		int[] smallestPair = new int[2];
		while (idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
			int firstNum = arrayOne[idxOne];
			int secondNum = arrayTwo[idxTwo];
			if (firstNum < secondNum) {
				current = secondNum - firstNum;
				idxOne += 1;
			} else if (firstNum > secondNum) {
				current = firstNum - secondNum;
				idxTwo += 1;
			} else {
				return new int[] { firstNum , secondNum };
			}
			if (smallest > current) {
				smallest = current;
				smallestPair = new int[] { firstNum , secondNum };
			}
		}
		
		return smallestPair;
	}

}
