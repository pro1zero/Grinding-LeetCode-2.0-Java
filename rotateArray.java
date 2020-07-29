import java.util.*;
public class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5};
		//naive(nums, 3);
		//usingExtraArray(nums, 3);
		usingReverse(nums, 3);
	}
	
	public static void naive(int[] nums, int k) {
		if(k == 0)
			return;
		int temp, previous;
		for(int i = 0; i < k; i++) {
			previous = nums[nums.length - 1];
			for(int j = 0; j < nums.length; j++) {
				temp = nums[j];
				nums[j] = previous;
				previous = temp;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void usingExtraArray(int[] nums, int k) {
		if(k == 0)
			return;
		
		int[] temp = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			temp[(i + k)%nums.length] = nums[i];
		}
		for(int i = 0; i < nums.length; i++) {
			nums[i] = temp[i];
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void usingReverse(int[] nums, int k) {
		k %= nums.length;
		
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
		
		System.out.println(Arrays.toString(nums));
	}
	
	public static void reverse(int[] nums, int left, int right) {
		while(left <= right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
	}
}
