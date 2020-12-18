
public class longestSubarrayAfterDeletingOneZero {

	public static void main(String[] args) {
		int[] nums = {1,1,0,0,1,1,1,0,1};
		System.out.println(longestSubArray(nums));
	}
	
	public static int longestSubArray(int[] nums) {
		int current = 0;
		int longest = 0;
		int removed = -1;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				current += 1;
			}
			else {
				current = i - removed;
				removed = i;
			}
			if(current > longest) {
				longest = current;
			}
		}
		return longest - 1;
	}

}
