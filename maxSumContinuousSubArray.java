import java.util.*;
public class maxSumContinuousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-5, -1, -8, -9};
		System.out.println(findMaxSum(nums));
	}
	
	public static int findMaxSum(int[] nums) {
		int[] dp = new int[nums.length + 1];
		int max = 0;
		dp[0] = 0;
		for(int i = 1; i<dp.length;i++) {
			dp[i] = Math.max(dp[i-1] + nums[i-1], nums[i-1]);
			max = Math.max(max, dp[i]);
		}
		return max;
	}
}
