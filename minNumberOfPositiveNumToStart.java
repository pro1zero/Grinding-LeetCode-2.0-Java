
public class minNumberOfPositiveNumToStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,-2,-3};
		System.out.println(minPositive(nums));
	}
	
	public static int minPositive(int[] nums) {
		int minPos = 1, sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] + sum < 1) {
				minPos = Math.max(minPos, Math.abs(nums[i] + sum) + 1);
			}
			sum += nums[i];
		}
		return minPos;
	}

}
