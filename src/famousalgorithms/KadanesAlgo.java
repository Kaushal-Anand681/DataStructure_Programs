package famousalgorithms;

public class KadanesAlgo {

	public static void main(String[] args) {
		// TO find maximum sum in a given array
		int[] array = {3,5,-9,7,9};//-14,8,-2,5,-9,-7,15,24,61};
		System.out.println(kadanesAlgorithm(array));

	}
	public static int kadanesAlgorithm(int[] array) {
	    int maxEndingHere = array[0];
			int maxSoFar = array[0];
			for(int i = 1;i < array.length;i++){
				int num = array[i];
				maxEndingHere = Math.max(num , maxEndingHere + num);
				maxSoFar = Math.max(maxSoFar , maxEndingHere);
			}
			return maxSoFar;
	  }

}
