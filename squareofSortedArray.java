import java.util.*;
public class squareofSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-6,1,2,3,4,5};
		System.out.println(sortedSquare(nums));
	}	
	
	public static String sortedSquare(int[] nums) {
		if(nums.length == 0)
			return "";
		
		int[] result = new int[nums.length];
		result[0] = Integer.MIN_VALUE;
		int left = 0;
		int right = nums.length - 1;
		int p = nums.length - 1;
		while(result[0] == Integer.MIN_VALUE) {
			int currentNum = Math.max(Math.abs(nums[left]), Math.abs(nums[right]));
			if( currentNum == Math.abs(nums[left])) {
				left++;
			}
			else {
				right--;
			}
			result[p--] = currentNum*currentNum;
		}
		return Arrays.toString(result);
	}

}
