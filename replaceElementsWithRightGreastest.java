import java.util.*;
public class replaceElementsWithRightGreastest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {17,18,5,4,6,1};
		System.out.println(replaceRight(nums));
	}
	
	public static String replaceRight(int[] nums) {
		int pin = -1;
		for(int i = nums.length - 1; i >= 0; i--) {
			int temp = nums[i];
			nums[i] = pin;
			pin = Math.max(pin, temp);
		}
		return Arrays.toString(nums);
	}

}
