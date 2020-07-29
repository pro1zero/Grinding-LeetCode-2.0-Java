
public class maxPointsAfterKCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,1};
		System.out.println(maxPoints(nums, 3));
	}
	
	public static int maxPoints(int[] nums, int k) {
		int left = 0;
		int right = 0;
		
		
		for(int i = 0; i < k; i++) {
			left += nums[i];
		}
		int max = left;
		for(int i = 0; i < k; i++) {
			left -= nums[k - 1 - i];
			right += nums[nums.length - 1 - i];
			max = Math.max(max, left + right);
		}
		return max;
	}
}
