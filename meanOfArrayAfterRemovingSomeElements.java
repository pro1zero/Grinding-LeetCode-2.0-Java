import java.util.*;
public class meanOfArrayAfterRemovingSomeElements {

	public static void main(String[] args) {
		int[] nums = {6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0};
		System.out.println(removeEle(nums));
	}
	
	public static double removeEle(int[] nums) {
		Arrays.sort(nums);
		double start =  nums.length * 5/100;
		double end = nums.length - start;
		int sum = 0;
		for(int i = (int)start; i < end; i++) {
			sum += nums[i];
		}
		return sum/(nums.length - 2*start);
	}

}
