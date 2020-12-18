import java.util.*;
public class permutationsRE {
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3));
		System.out.println(permute(nums));
	}
	
	public static List<List<Integer>> permute(List<Integer> nums){
		List<List<Integer>> permutations = new ArrayList<>();
		helper(0, nums, permutations);
		return permutations;
	}
	
	public static List<List<Integer>> helper(int i, List<Integer> nums, List<List<Integer>> permutations){
		if(i == nums.size() - 1) {
			permutations.add(new ArrayList<>(nums));
		}
		else {
			for(int j = i; j < nums.size(); j++) {
				swap(i, j, nums);
				helper(i+1, nums, permutations);
				swap(i, j, nums);
			}
		}
		return permutations;
	}
	
	public static void swap(int i, int j, List<Integer> nums) {
		int temp = nums.get(i);
		nums.set(i, nums.get(j));
		nums.set(j, temp);
	}

}
