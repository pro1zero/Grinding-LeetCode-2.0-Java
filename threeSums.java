import java.util.*;
public class threeSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(optimal(nums));
	}
	
	public static List<List<Integer>> optimal(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		if(nums.length == 0)
			return result;
		Arrays.sort(nums);
		for(int i = 0; i<nums.length - 2;i++) {
			int num = nums[i];
			int start = i + 1;
			int end = nums.length - 1;
			while(start < end) {
				if(num + nums[start] + nums[end] == 0) {
					/*if(!result.contains(Arrays.asList(num, nums[start], nums[end])))*/
					result.add(Arrays.asList(num, nums[start], nums[end]));
					start++;
					end--;
				}
				
				else if(num + nums[start] + nums[end] > 0) {
					end--;
				}
				
				else {
					start++;
				}
			}
		}
		Set<List<Integer>> temp = new HashSet<>();
		for(List<Integer> i: result) {
			temp.add(i);
		}
		result.clear();
		for(List<Integer> i: temp) {
			result.add(i);
		}
		return result;
	}

}
