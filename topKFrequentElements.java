import java.util.*;
public class topKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,2,1,1,3};
		System.out.println(kFrequent(nums, 2));
	}
	
	public static int[] kFrequent(int[] nums, int k){
		if(nums.length == 0)
			return new int[] {};
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>((a, b) -> map.get(a) - map.get(b));
		for(int num: map.keySet()) {
			heap.add(num);
			if(heap.size() > k) {
				heap.poll();
			}
		}
		int[] result = new int[k];
		while(k-1 >= 0) {
			result[--k] = heap.poll();
		}
		
		return result;
	}

}
