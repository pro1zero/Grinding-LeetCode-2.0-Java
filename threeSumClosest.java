import java.util.*;
public class threeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1, 2, 1, -4};
		//System.out.println(calculateThreeSum(nums, 10));
		System.out.println(closestThreeSum(nums, 1));
	}	
	
	public static boolean calculateThreeSum(int[] nums, int target) {
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			
			while(left < right) {
				if(nums[i] + nums[left] + nums[right] == target) {
					System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);
					return true;
				}
				else if(nums[i] + nums[left] + nums[right] < target) {
					left++;
					continue;
				}
				else {
					right--;
					continue;
				}
			}
		}
		return false;
	}
	
	public static int closestThreeSum(int[] nums, int target) {
		Arrays.sort(nums);
		int smallestDiff = Integer.MAX_VALUE;
		int result = 0;
		
		for(int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			
			while(left < right) {
				int currentSum = nums[i] + nums[left] + nums[right];
				if(Math.abs(currentSum - target) < smallestDiff) {
					smallestDiff = Math.abs(currentSum - target);
					result = currentSum;
				}
				
				if(nums[i] + nums[left] + nums[right] < target) {
					left++;
					continue;
				}
				
				else {
					right--;
					continue;
				}
			}
		}
		return result;
	}

}
