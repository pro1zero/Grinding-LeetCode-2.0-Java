import java.util.*;
public class singleNumberTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0, 1, 99, 1, 0, 0, 1};
		
		System.out.println(check(nums));
	}
	
	public static int check(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num: nums) {
			if(!map.containsKey(num))
				map.put(num, 1);
			
			else {
				map.put(num, map.get(num) + 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue() == 1){
				return entry.getKey();
			}
		}
		
		System.out.println(map);
		return -1;
 	}

}
