
public class minCostToClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		System.out.println(calculateCost(cost));
	}	
	
	public static int calculateCost(int[] cost) {
		int[] dp = new int[cost.length + 1];
		dp[0] = dp[1] = 0;
		for(int i = 2; i <= cost.length; i++) {
			dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
		}
		return dp[dp.length - 1];
	}
}
