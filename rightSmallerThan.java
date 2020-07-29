import java.util.*;
public class rightSmallerThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8, 5, 11, -1, 3, 4, 2};
		System.out.println(calculateRightSmallerThan(nums));
		System.out.println(usingDP(nums));
	}
	
	public static String calculateRightSmallerThan(int[] nums) {
		if(nums.length == 0)
			return "";
		
		int[] result = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			int count = 0;
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					count += 1;
				}
			}
			result[i] = count;
		}
		return Arrays.toString(result);
	}

	public static String usingDP(int[] nums) {
		if(nums.length == 0)
			return "";
			
		int[] result = new int[nums.length];
		
		for(int i = nums.length - 2; i >= 0; i--) {
			if(nums[i] > nums[i+1]) {
				result[i] = result[i+1] + 1;
			}
			else {
				int j = i+1;
				while(j < nums.length) {
					if(nums[i] > nums[j]) {
						result[i] += 1;
					}
					j++;
				}
			}
		}
		return Arrays.toString(result);
	}
}
