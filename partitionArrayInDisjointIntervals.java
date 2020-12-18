
public class partitionArrayInDisjointIntervals {

	public static void main(String[] args) {
		int[] nums = {5,0,3,8,6};
		System.out.println(partitionArray(nums));
	}
	
	public static int partitionArray(int[] nums) {
		int[] minRear = new int[nums.length];
		int[] maxFront = new int[nums.length];
		int toCompare = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++) {
			toCompare = Math.max(toCompare, nums[i]);
			maxFront[i] = toCompare;
		}
		toCompare = Integer.MAX_VALUE;
		for(int i = nums.length - 1; i >= 0; i--) {
			toCompare = Math.min(toCompare, nums[i]);
			minRear[i] = toCompare;
		}
		for(int i = 1; i < nums.length; i++) {
			if(maxFront[i - 1] <= minRear[i]) return i;
		}
		throw null;
	}

}
