import java.util.*;
public class pairsOfSongsWithTotalDuration {

	public static void main(String[] args) {
		int[] nums = {60,60,60};
		System.out.println(findPairs(nums));
	}
	
	public static int findPairs(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for(int num: nums) {
			
			int diff = 60 - (num%60);
			count += map.getOrDefault(diff, 0);
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		return count;
	}
}
