import java.util.Arrays;

public class perfectSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(perfect(10));
	}
	
	public static int perfect(int n) {
		if(n <= 0)
			return 0;
		
		int[] dp = new int[n+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1; j*j <=i;j++) {
				dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
			}
		}
		return dp[n];
	}

}
