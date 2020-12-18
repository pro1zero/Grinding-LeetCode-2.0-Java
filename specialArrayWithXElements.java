import java.util.Arrays;

public class specialArrayWithXElements {

	public static void main(String[] args) {
		int[] nums = {3,6,7,7,0};
		System.out.println(countSpecial(nums));
	}
	
	public static int countSpecial(int[] nums) {
		Arrays.sort(nums);
		int result = nums.length;
		for(int i = nums.length; i >= 0; i--) {
			int bigOnes = 0;
			int j = nums.length - 1;
			while(j >= 0) {
				if(nums[j] >= i) {
					bigOnes += 1;
				}
				j -= 1;
			}
			if(bigOnes == result) return result;
			result -= 1;
		}
		return (result == 0) ? -1 : result;
	}

}
