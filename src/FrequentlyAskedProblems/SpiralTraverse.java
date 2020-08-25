package FrequentlyAskedProblems;

import java.util.ArrayList;

public class SpiralTraverse {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4 }, { 12, 13, 14, 5 }, { 11, 16, 15, 6 }, { 10, 9, 8, 7 } };
		ArrayList<Integer> ans = spiralTraverse(array);
		System.out.print(ans + " ");
		System.out.println();
	}

	public static ArrayList<Integer> spiralTraverse(int[][] array) {
		if (array.length == 0)
			return new ArrayList<Integer>();
		int sR = 0;
		int sC = 0;
		int eR = array.length - 1;
		int eC = array[0].length - 1;
		ArrayList<Integer> solution = new ArrayList<Integer>();
		while (sR <= eR && sC <= eC) {
			for (int i = sC; i <= eC; i++) {
				solution.add(array[sR][i]);
			}

			for (int i = sR + 1; i <= eR; i++) {
				solution.add(array[i][eC]);
			}

			for (int i = eC - 1; i >= sC; i--) {
				if (sR == eR)
					break;
				solution.add(array[eR][i]);
			}

			for (int i = eR - 1; i > sR; i--) {
				if (sC == eC)
					break;
				solution.add(array[i][sC]);
			}
			sC++;
			sR++;
			eC--;
			eR--;
		}
		return solution;
	}

}
