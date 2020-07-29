import java.util.Arrays;

public class runningSumSoFar {
	public static void main(String[] args) {
		int[] nums = {3};
		System.out.println(sumSoFar(nums));
	}
	
	public static String sumSoFar(int[] nums) {
		for(int i = 1; i < nums.length; i++)
			nums[i] = nums[i-1] + nums[i];
		return Arrays.toString(nums);
	}
}
