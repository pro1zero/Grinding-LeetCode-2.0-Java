import java.util.Arrays;

public class squaresInAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-4,1,2,4,7,-10,4,5,8,9,0};
		System.out.println(squares(nums));
	}
	
	public static String squares(int[] nums) {
		Arrays.sort(nums);
		int left = 0;
		int right = nums.length - 1;
		int[] result = new int[nums.length];
		result[0] = Integer.MAX_VALUE;
		int count = nums.length - 1;
		
		while(result[0] == Integer.MAX_VALUE) {
			if(Math.abs(nums[left]) >= Math.abs(nums[right])) {
				result[count] = nums[left]*nums[left];
				left++;
			}else{
				result[count] = nums[right]*nums[right];
				right--;
			}
			count -= 1;
		}
		return Arrays.toString(result);
	}	
}
