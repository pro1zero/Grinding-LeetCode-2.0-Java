import java.util.*;
public class maxNumOfKSumPairs {

	public static void main(String[] args) {
		int[] nums = {3,1,3,4,3};
		System.out.println(maxPairs(nums, 6));
		System.out.println(inBigON(nums, 6));
	}
	
	public static int maxPairs(int[] nums, int target) {
		int maxPairs = 0;
		Arrays.sort(nums);
		int left = 0;
		int right = nums.length - 1;
		while(left < right) {
			if(nums[left] + nums[right] < target) {
				left += 1;
			}
			else if(nums[left] + nums[right] > target) {
				right -= 1;
			}
			else {
				maxPairs += 1;
				left += 1;
				right -= 1;
			}
		}
		return maxPairs;
	}
	
	public static int inBigON(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int maxPairs = 0;
		for(int num: nums) {
			if(map.containsKey(num) && map.get(num) > 0) {
				maxPairs += 1;
				map.put(num, map.get(num) - 1);
			}
			else {
				map.put(target - num, map.getOrDefault(target - num, 0) + 1);
			}
		}
		return maxPairs;
	}

}
