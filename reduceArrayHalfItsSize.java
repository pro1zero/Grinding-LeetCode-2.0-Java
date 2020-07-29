import java.util.*;
public class reduceArrayHalfItsSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {7,7,7,7,7,7,7,7,7,7};
		System.out.println(reduce(nums));
	}
	
	public static int reduce(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int n = nums.length;
		for(int i = 0; i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		System.out.println(map);
		
		List<Integer> frequencies = new ArrayList<>(map.values());
		
		Collections.sort(frequencies);
		Collections.reverse(frequencies);
		
		int sum = 0;
		int result = 0;
		for(int i = 0; i<frequencies.size();i++) {
			if(sum >= n/2) {
				return result;
			}
			sum += frequencies.get(i);
			result++;
		}
		return result;
	}

}
