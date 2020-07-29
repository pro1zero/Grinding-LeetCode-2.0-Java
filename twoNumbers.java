import java.util.*;
public class twoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 5, -4, 8, 11, 1, -1, 6};
		System.out.println(twoPointers(nums, 10));
	}
	
	public static String twoPointers(int[] nums, int target){
		if(nums.length == 0) {
			return Arrays.toString(new int[] {});
		}
		
		Arrays.sort(nums);
		
		int left = 0;
		int right = nums.length - 1;
		
		while(left < right) {
			if(nums[left] + nums[right] > target) {
				right--;
			}
			else if(nums[left] + nums[right] < target) {
				left++;
			}
			
			else if(nums[left] + nums[right] == target){
				return Arrays.toString(new int[] {nums[left], nums[right]});
			}
		}
		return Arrays.toString(new int[] {});
	}
}
