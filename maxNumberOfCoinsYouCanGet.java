import java.util.*;
public class maxNumberOfCoinsYouCanGet {

	public static void main(String[] args) {
		int[] nums = {2,4,5};
		System.out.println(maxCoins(nums));
	}
	
	public static int maxCoins(int[] nums) {
		Arrays.sort(nums);
		int maxCoins = 0, count = nums.length/3, i = nums.length - 2;
		while(count > 0) {
			maxCoins += nums[i];
			i -= 2;
			count-= 1;
		}
		return maxCoins;
	}
}
