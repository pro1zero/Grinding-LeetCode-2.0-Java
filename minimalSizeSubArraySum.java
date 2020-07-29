import java.util.stream.*;
public class minimalSizeSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,1,2,4,3};
		//System.out.println(minimalSize(nums, 7));
	}
	
	public static int minimalSize(int[] nums, int sum) {
		
		if(nums.length == 0 || IntStream.of(nums).sum() < sum)
			return 0;
		
		int minSize = Integer.MAX_VALUE;
		
		for(int i = 0; i < nums.length; i++) {
			int tempSum = 0;
			int tempSize = 0;
			int j = i;
			
			while(j < nums.length && tempSum < sum) {
				tempSize++;
				tempSum += nums[j];
				j++;
			}
			if(tempSum >= sum)
				minSize = Math.min(minSize, tempSize);
		}
		
		return minSize;
	}
}
