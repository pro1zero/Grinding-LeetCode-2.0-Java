import java.util.*;
public class kThPositiveMissing {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(findK(nums, 2));
	}
	
	public static int findK(int[] nums, int k) {
		Map<Integer, Boolean> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], true);
		}
		int num = 1;
		while(k > 0) {
			if(map.containsKey(num++)) {
				continue;
			}
			k--;
		}
		return num - 1;
	}
}
