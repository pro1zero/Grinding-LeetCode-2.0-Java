//
//public class sumOfAllOddLengthsSubArrays {
//
//	public static void main(String[] args) {
//		int[] nums = {1, 2, 4, 5, 3};
//		System.out.println(bruteforce(nums));
//	}
//	
//	public static int bruteforce(int[] nums) {
//		if(nums.length == 0) return 0;
//		int[] prefixSum = new int[nums.length];
//		prefixSum[0] = nums[0];
//		for(int i = 1; i < nums.length; i++) {
//			prefixSum[i] = nums[i] + prefixSum[i-1];
//		}
//		int result = 0;
//		
//		
//	}
//
//}
