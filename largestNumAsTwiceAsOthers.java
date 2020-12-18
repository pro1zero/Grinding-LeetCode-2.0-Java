import java.util.*;
public class largestNumAsTwiceAsOthers {

	public static void main(String[] args) {
		int[] nums = {1, 0};
//		System.out.println(asTwice(nums));
//		System.out.println(asTwiceOptimal(nums));
		System.out.println(twoPointers(nums));
	}
	
	public static int asTwice(int[] nums) {
		if(nums.length == 1)
			return 0;
		int max = Integer.MIN_VALUE;
		int index = -1;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
		Arrays.sort(nums);
		if(nums[nums.length - 1] >= (2*nums[nums.length - 2]))
			return index;
		return -1;
	}
	
	public static int asTwiceOptimal(int[] nums) {
		if(nums.length == 1)
			return 0;
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		int index = -1;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
				index = i;
			}
			heap.offer(nums[i]);
			if(heap.size() > 2)
				heap.poll();
		}
		int secondBiggest = heap.poll();
		int biggest = heap.poll();
		return (biggest >= secondBiggest*2)?index:-1;
	}
	
	public static int twoPointers(int[] nums) {
		if(nums.length == 1)
			return 0;
		int index = -1;
		int max = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				second = max;
				max = nums[i];
				index = i;
			}
		}
		System.out.println(max + " s s" + second);
		return -1;
	}

}
