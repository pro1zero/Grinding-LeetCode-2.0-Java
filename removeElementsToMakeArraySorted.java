
public class removeElementsToMakeArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,10,4,2,3,5};
		System.out.println(removeMinEle(nums));
	}
	
	public static int removeMinEle(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		while(left + 1 < nums.length && nums[left] <= nums[left + 1]) left += 1;
		if(left == nums.length - 1) return 0;
		while(right - 1 >= 0 && nums[right - 1] <= nums[right]) right -= 1;
		int max = 0;
		int minRange = Math.min(nums.length - 1 - left, right);
		while(max <= left && right < nums.length) {
			while(max <= left && nums[max] <= nums[right]) max += 1;
			minRange = Math.min(minRange, right - max);
			while(right < nums.length && max < nums.length && nums[max] > nums[right]) right += 1;
		}
		return minRange;
	}

}
