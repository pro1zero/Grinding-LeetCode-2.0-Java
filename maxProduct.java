import java.util.Arrays;

public class maxProduct {
	public static void main(String[] args) {
		int[] nums = {2,-5,-2,-4,3};
		//System.out.println(silly(nums));
		//System.out.println(optimal(nums));
		System.out.println(maxProductSubArray(nums));
	}
	
	
	public static int maxProductSubArray(int[] nums) {
		if(nums.length == 0)
			return 0;
		if(nums.length == 1)
			return nums[0];
		int result = Integer.MIN_VALUE;
		for(int i = 0; i<nums.length - 1;i++) {
			int product = nums[i];
			int max = nums[i];
			for(int j = i + 1;j < nums.length;j++) {
				product *= nums[j];
				max = Math.max(max, product);
			}
			result = Math.max(result, max);
		}
		return Math.max(result, nums[nums.length - 1]);
	}
	
	public static int optimalMaxProductSubArray(int[] nums) {
		return 0;
	}
	
	
	public static int optimal(int[] nums) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		System.out.println(max1 + " "+ max2 + " "+ max3);
		System.out.println(min1 + " "+ min2);
		for(int i = 0;i<nums.length;i++) {
			if(nums[i] <= min1) {
				min2 = min1;
				min1 = nums[i];
			}
			
			else if(nums[i] < min2) {
				min2 = nums[i];
			}
			
			if(nums[i] >= max3) {
				max1 = max2;
				max2 = max3;
				max3 = nums[i];
			}
			
			else if(nums[i] >= max2 && nums[i] < max3) {
				max1 = max2;
				max2 = nums[i];
			}
			
			else if(nums[i] > max1 && nums[i] < max2) {
				max1 = nums[i];
			}
			
		}
		
		System.out.println(max1 + " " + max2 + " " + max3 + " " + min1 + " " + min2);
		return Math.max(max1*max2*max3, max3*min1*min2);
	}
	
	
	public static int silly(int[] nums) {
		Arrays.sort(nums);
		return Math.max(nums[nums.length -1]*nums[nums.length -2]*nums[nums.length -3], nums[nums.length -1]*nums[1]*nums[0]);
	}
}
