package DynamicProgramming;

public class WaterArea {

	public static void main(String[] args) {
		int[] heights = { 0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3 };
		 System.out.println(waterArea(heights));
//		waterArea(heights);
	}

	private static int waterArea(int[] heights) {
		int[] leftMax = new int[heights.length];
		int[] rightMax = new int[heights.length];
		int height = 0;
		for (int i = 0; i < leftMax.length; i++) {
			leftMax[i] = height;
			height = Math.max(height, heights[i]);
		}
		height = 0;
//		for (int x : leftMax) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
		for (int i = rightMax.length - 1; i >= 0; i--) {
			rightMax[i] = height;
			height = Math.max(height, heights[i]);

		}
//		for (int x : rightMax) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
		int[] water = new int[heights.length];
		for (int i = 0; i < water.length; i++) {
			int minHeight = Math.min(leftMax[i], rightMax[i]);
			if (minHeight > heights[i]) {
				water[i] = minHeight - heights[i];
			} else {
				water[i] = 0;
			}
		}
		int total = 0;
		for (int x : water) {
			total = total + x;
		}
		return total;

	}

}
