import java.util.*;
public class thirdMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,3};
		System.out.println(usingHeap(nums));
		//System.out.println(helper(nums));
	}
	
	public static int usingHeap(int[] nums) {
		PriorityQueue<Integer> max = new PriorityQueue<Integer>();
		int keepTrack = Integer.MIN_VALUE;
		for(int num: nums) {
			keepTrack = Math.max(keepTrack, num);
			if(!max.contains(num))
				max.offer(num);
			if(max.size() > 3){
				max.poll();
			}
		}
		return (max.size() >= 3)?max.poll():keepTrack;
	}
	public static int helper(int[] nums) {
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
		if(nums.length == 1)
			return nums[0];
		if(nums.length == 2)
			return Math.max(nums[0], nums[1]);
		
		Set<Integer> set = new TreeSet<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > first) {
				set.clear();
				third = second;
				second = first;
				first = nums[i];
				set.add(first);
				set.add(second);
				set.add(third);
			}else if(nums[i] > second) {
				set.remove(second);
				set.remove(third);
				third = second;
				second = nums[i];
				set.add(second);
				set.add(third);
			}else if(nums[i] > third) {
				set.remove(third);
				third = nums[i];
				set.add(third);
			}
		}
		System.out.println(set);
		int result = Integer.MAX_VALUE;
		for(int i: set) {
			if(i < result)
				result = i;
		}
		return result;
	}

}
