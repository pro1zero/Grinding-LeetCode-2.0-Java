
public class maximumNonNegativeProductInAMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,-2,1}, {1,-2,1}, {3,-4,1}};
		System.out.println(getMaxProduct(matrix));
	}
	
	public static int getMaxProduct(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		long[][][] dp = new long[rows][cols][2];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					dp[i][j][0] = 0;
					dp[i][j][1] = 0;
					continue;
				}
				long upMin = i > 0 ? dp[i-1][j][0] : Integer.MAX_VALUE;
				long leftMin = j > 0 ? dp[i][j-1][0] : Integer.MAX_VALUE;
				long min = Math.min(upMin, leftMin);
				min = min != Integer.MAX_VALUE ? min : 1;
				long upMax = i > 0 ? dp[i-1][j][1] : Integer.MIN_VALUE;
				long leftMax = j > 0 ? dp[i][j-1][1] : Integer.MIN_VALUE;
				long max = Math.max(upMax, leftMax);
				max = max != Integer.MIN_VALUE ? max : 1;
				if(matrix[i][j] > 0) {
					dp[i][j][0] = matrix[i][j] * min;
					dp[i][j][1] = matrix[i][j] * max;
				}else {
					dp[i][j][0] = matrix[i][j] * max;
					dp[i][j][1] = matrix[i][j] * min;
				}
			}
		}
		long result = dp[rows - 1][cols - 1][1];
		return result < 0 ? -1 : (int)(result%((long)1e9+7));
	}

}
