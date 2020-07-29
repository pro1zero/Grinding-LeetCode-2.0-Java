import java.util.*;
public class uniqueoccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,1};
		System.out.println(countOccurences(nums));
	}
	
	public static boolean countOccurences(int[] nums) {
		if(nums.length == 0)
			return true;
		
		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i<nums.length;i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}
			else {
				int p = map.get(nums[i]);
				map.put(nums[i], ++p);
			}
		}
		
		Iterator mapIterator = map.entrySet().iterator();
		while(mapIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry)mapIterator.next();
			int i = (int)mapElement.getValue();
			if(!set.contains(i)) {
				set.add(i);
			}else {
				return false;
			}
		}
		
		return true;
	}

}
