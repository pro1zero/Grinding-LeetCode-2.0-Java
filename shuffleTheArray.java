import java.util.Arrays;

public class shuffleTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,1,3,4,7};
		System.out.println(shuffle(nums));
	}
	
	public static String shuffle(int[] nums) {
		int[] result = new int[nums.length];
		int p = 0;
		for(int i = 0; i < nums.length/2; i++) {
			result[p] = nums[i];
			p += 2;
		}
		p = 1;
		for(int i = nums.length/2; i < nums.length; i++) {
			result[p] = nums[i];
			p += 2;
		}
		return (Arrays.toString(result));
	}

}
