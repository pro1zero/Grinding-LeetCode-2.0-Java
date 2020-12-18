import java.util.*;
public class canMakeAP {

	public static void main(String[] args) {
		int[] nums = {1,5};
		System.out.println(isAP(nums));
	}
	
	
	public static boolean isAP(int[] nums) {
		Arrays.sort(nums);
		int difference = nums[1] - nums[0];
		for(int i = 1; i < nums.length - 1; i++) {
			if(nums[i+1] - nums[i] != difference)
				return false;
		}
		return true;
	}
}
