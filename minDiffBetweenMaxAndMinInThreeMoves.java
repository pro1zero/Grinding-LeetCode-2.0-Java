import java.util.*;
public class minDiffBetweenMaxAndMinInThreeMoves {

	public static void main(String[] args) {
		int[] nums = {6,4,1,1,0,6,6};
		System.out.println(findMinDiff(nums));
	}
	
	public static int findMinDiff(int[] nums) {
		if(nums.length < 5)
			return 0;
		int minDiff = Integer.MAX_VALUE;
		Arrays.sort(nums);
		for(int i = 0; i <= 3; i++) {
			minDiff = Math.min(minDiff, nums[nums.length - i - 1] - nums[3 - i]);
		}
		return minDiff;
	}
}
