import java.util.*;
public class arithmeticSubArrays {

	public static void main(String[] args) {
		int[] nums = {4,6,5,9,3,7};
		int[] L = {0,0,2};
		int[] R = {2,3,5};
		System.out.println(calc(nums, L, R));
	}
	
	public static List<Boolean> calc(int[] nums, int[] L, int[] R){
		List<Boolean> result = new ArrayList<>();
		for(int i = 0; i < L.length; i++) {
			int[] subArray = Arrays.copyOfRange(nums, L[i], R[i] + 1);
			Arrays.sort(subArray);
			result.add(isAS(subArray));
		}
		return result;
	}
	
	public static boolean isAS(int[] nums) {
		if(nums.length <= 2) {
			return true;
		}
		int diff = nums[1] - nums[0];
		for(int i = 2; i < nums.length; i++) {
			if(nums[i] - nums[i - 1] != diff) return false;
		}
		return true;
	}

}
