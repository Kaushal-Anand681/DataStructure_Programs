package TargetSumProblems;

import java.util.Arrays;

import java.util.*;

public class TwoNumberSum {

	public static void main(String[] args) {
		int[] array = new int[] { 5, 7, 9, 11, -1, 2, 6, -4 };
		int[] ans = new int[2];
		int targetSum = 5;
//		ans = method1(array , targetSum);
		ans = method2(array, targetSum);
		ans = method3(array, targetSum);
		for (int x : ans) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	private static int[] method3(int[] array, int targetSum) {
		// Using Arrays.sort()
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		while(left < right) {
			int currentSum = array[left] + array[right];
			if(currentSum == targetSum) {
				return new int[] {array[left], array[right]};
			}else if(currentSum < targetSum) {
				left++;
			}else if(currentSum > targetSum) {
				right--;
			}
		}
		return new int[0];
	}

	private static int[] method2(int[] array, int targetSum) {
		// Using HashSet
		Set<Integer> nums = new HashSet<>();
		for (int x : array) {
			int potentialSearch = targetSum - x;
			if (nums.contains(potentialSearch)) {
				return new int[] { x, potentialSearch };
			} else {
				nums.add(x);
			}
		}
		return new int[0];
	}

	private static int[] method1(int[] array, int targetSum) {
		// Using 2 for loops
		for (int i = 0; i < array.length - 1; i++) {
			int firstNum = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int secondNum = array[j];
				if (firstNum + secondNum == targetSum) {
					return new int[] { firstNum, secondNum };
				}
			}
		}
		return new int[0];
	}

}
