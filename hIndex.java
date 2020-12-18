import java.util.*;
public class hIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,6,0,1,3};
		System.out.println(calc(nums));
	}
	
	public static int calc(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		for(int i = nums.length; i >= 1; i--) {
			if(nums[n - i] >= i)
				return i;
		}
		return 0;
	}

}
