import java.util.*;
public class duplicateZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,2,3,0,4,5,0};
		naive(nums);
	}
	
	public static void naive(int[] nums) {
		int[] temp = new int[nums.length];
		int i = 0;
		int j = 0;
		while(i < nums.length && j < temp.length) {
			temp[j] = nums[i];
			if(nums[i] == 0) {
				j += 1;
				temp[j] = 0;
			}
			i += 1;
			j += 1;
		}
		System.out.println(Arrays.toString(temp));
		return;
	}
}
