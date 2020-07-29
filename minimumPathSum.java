public class minimumPathSum {

	public static void main(String[] args) {
		int[][] matrix = {{1}};
		System.out.println(findMin(matrix));
	}
	
	public static int findMin(int[][] matrix) {
		if(matrix.length == 1  && matrix[0].length == 1) {
			return matrix[0][0];
		}
		int[][] dp = new int[matrix.length][matrix[0].length];
		int sum = 0;
		for(int i = 0; i < matrix[0].length; i++) {
			sum += matrix[0][i];
			dp[0][i] += sum;
		}
		sum = 0;
		for(int i = 0; i < matrix.length; i++) {
			sum += matrix[i][0];
			dp[i][0] += sum;
		}
		
		for(int i = 1; i < matrix.length; i++) {
			for(int j = 1; j < matrix[i].length; j++) {
				dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + matrix[i][j];
			}
		}
		return dp[matrix.length - 1][matrix[0].length - 1];
	}
}
