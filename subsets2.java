import java.util.*;
public class subsets2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,1,4,4,4};
		System.out.println(iterative(nums));
	}
	
	public static List<List<Integer>> iterative(int[] nums){
		List<List<Integer>> subsets = new ArrayList<>();
		subsets.add(new ArrayList<>());
		
		if(nums.length == 0) {
			return subsets;
		}
		
		for(Integer num: nums) {
			int length = subsets.size();
			for(int i = 0; i<length;i++) {
				List<Integer> currentSubset = new ArrayList<>(subsets.get(i));
				currentSubset.add(num);
				Collections.sort(currentSubset);
				if(!subsets.contains(currentSubset))
					subsets.add(currentSubset);
			}
		}
		return subsets;
	}

}
