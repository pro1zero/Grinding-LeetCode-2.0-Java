import java.util.Arrays;
import java.util.HashMap;

public class threeSumWithMultiplicity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,2,2};
		System.out.println(threeSumWithMultiplicity(nums, 5));
	}
	
	public static int threeSumWithMultiplicity(int[] nums, int target) {
		Arrays.sort(nums);
		int result = 0;
		
		for(int i = 0; i < nums.length; i++) {
			int twoSum = target - nums[i];
			HashMap<Integer, Integer> map = new HashMap<>();
			for(int j = i+1; j < nums.length; j++) {
				if(!map.containsKey(twoSum - nums[j])) {
					map.put(twoSum-nums[j], nums[j]);
				}else {
					System.out.println(nums[i] + " | " + nums[j] + " | " + (target - nums[j] - nums[i]));
					result++;
				}
			}
		}
		return (int) (result%(Math.pow(10, 9) + 7));
	}

}
