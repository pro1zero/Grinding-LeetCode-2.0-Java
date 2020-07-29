import java.util.*;

public class transformInRankArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100,100,100};
		System.out.println(rank(nums));
	}
	
	public static int[] rank(int[] nums) {
		if(nums.length == 0)
			return null;
		if(nums.length == 1)
			return new int[] {1};
		Map<Integer, Integer> map = new HashMap<>();
		int[] numsSorted = nums.clone();
		Arrays.sort(numsSorted);
		map.put(numsSorted[0], 1);
		int p = 1;
		for(int i = 1; i<numsSorted.length;i++) {
			if(map.containsKey(numsSorted[i])) {
				continue;
			}
			else {
				p++;
				map.put(numsSorted[i], p);
			}
		}
		for(int i = 0;i<nums.length;i++) {
			nums[i] = map.get(nums[i]);
		}
		return nums;
	}

}
