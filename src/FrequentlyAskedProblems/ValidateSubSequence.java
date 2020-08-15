package FrequentlyAskedProblems;

import java.util.ArrayList;


public class ValidateSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(5);
		array.add(1);
		array.add(22);
		array.add(25);
		array.add(6);
		array.add(-1);
		array.add(8);
		array.add(10);
		
		
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		sequence.add(1);
		sequence.add(6);
		sequence.add(-1);
		sequence.add(10);
		
		System.out.println(isValidSubSequence(array , sequence));

	}

	private static boolean isValidSubSequence(ArrayList<Integer> array, ArrayList<Integer> sequence) {
		// TODO Auto-generated method stub
		int subseqIdx = 0;
		
		for(int x : array) {
			if(subseqIdx == sequence.size()) {
				return true;
			}
			if(sequence.get(subseqIdx) == x) {
				subseqIdx++;
			}
		}
		
		return subseqIdx == sequence.size();
	}

}
