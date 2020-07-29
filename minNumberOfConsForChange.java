import java.util.Arrays;

public class minNumberOfConsForChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] denoms = {1, 5, 10, 2};
		System.out.println(calculate(denoms, 10));
	}
	
	public static int calculate(int[] denoms, int target) {
		int[] dp = new int[target + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		int toCompare = 0;
		for(int denom: denoms) {
			for(int amount = 0; amount < dp.length; amount++) {
				if(denom <= amount) {
					if(dp[amount - denom] == Integer.MAX_VALUE)
						toCompare = dp[amount - denom];
					else
						toCompare = dp[amount - denom] + 1;
					dp[amount] = Math.min(dp[amount], dp[amount - denom] + 1);
				}
			}
		}
		System.out.println(Arrays.toString(dp));
		return dp[target] == Integer.MAX_VALUE?-1:dp[target];
	}

}
