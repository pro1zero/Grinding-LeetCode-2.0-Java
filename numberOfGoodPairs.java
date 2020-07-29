import java.util.*;
public class numberOfGoodPairs {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,3};
		System.out.println(goodPairs(nums));
	}
	
	public static int goodPairs(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int num: nums) {
			if(!map.containsKey(num)) {
				map.put(num, 1);
			}else {
				int count = map.get(num);
				map.put(num, ++count);
			}
		}
		int total = 0;
		for(int num: map.keySet()) {
			total += (map.get(num)*(map.get(num)-1))/2;
		}
		return total;
	}
}
