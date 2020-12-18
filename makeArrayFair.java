
public class makeArrayFair {

	public static void main(String[] args) {
		System.out.println(findIndices(new int[] {2,1,6,4}));
	}
	
	public static int findIndices(int[] nums) {
		int rightEven = 0;
		int rightOdd = 0;
		for(int i = 0; i < nums.length; i++) {
			if(i % 2 == 0) rightEven += nums[i];
			else rightOdd += nums[i];
		}
		int leftEven = 0;
		int leftOdd = 0;
		int totalIndices = 0;
		for(int i = 0; i < nums.length; i++) {
			if(i % 2 == 0) rightEven -= nums[i];
			else rightOdd -= nums[i];
			if(rightEven + leftOdd == rightOdd + leftEven) totalIndices += 1;
			if(i % 2 == 0) leftEven += nums[i];
			else leftOdd += nums[i];
		}
		return totalIndices;
	}
}
