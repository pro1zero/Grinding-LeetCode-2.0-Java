import java.util.Arrays;

public class minNumberOfJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 4, 2, 1, 2, 3, 7, 1, 1, 1, 3};
		System.out.println(naive(nums));
	}
	
	public static int naive(int[] nums) {
		int[] dp = new int[nums.length];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for(int i = 1; i<nums.length;i++) {
			for(int j = 0; j<i;j++) {
				if(nums[j] + j >= i) {
					dp[i] = Math.min(dp[i], dp[j] + 1);
				}
			}
		}
		return dp[dp.length - 1];
	}
	
	
	
}
