import java.util.*;
public class validTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,3,4,4,5,6,7,8,9};
		System.out.println(validate(nums));
	}
	
	public static int validate(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		for(int i = 0; i < nums.length - 2; i++) {
			int k = i + 2;
			for(int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
				while(k < nums.length && nums[i] + nums[j] > nums[k]) {
					k++;
				}
				count += k - j - 1;
			}
		}
		return count;
	}
}
