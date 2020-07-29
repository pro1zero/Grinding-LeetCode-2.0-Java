import java.util.stream.*;
public class shortestSubarrayWithSumAtleastK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {17,85,93,-45,-21};
		System.out.println(shortestLength(nums, 150));
	}
	
	public static int shortestLength(int[] nums, int target) {
		if(nums.length == 0)
			return 0;
		
		
		int minLength = Integer.MAX_VALUE;
		
		for(int i = 0; i < nums.length; i++) {
			int runningSum = 0;
			int count = 0;
			for(int j = i; j < nums.length; j++) {
				if(runningSum < target) {
					runningSum += nums[j];
					count++;
				}
				else
					break;
			}
			if(runningSum >= target)
				minLength = Math.min(minLength, count);
		}
		return (minLength == Integer.MAX_VALUE)?-1:minLength;
	}

}
