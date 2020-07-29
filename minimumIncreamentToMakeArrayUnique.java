import java.util.*;
import java.util.stream.*;
public class minimumIncreamentToMakeArrayUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,1};
		System.out.println(makeMinSteps(nums));
	}
	
	public static int makeMinSteps(int[] nums) {
		Arrays.sort(nums);
		//System.out.println(Arrays.toString(nums));
		if(nums.length < 2)
			return 0;
		
		int oldSum = IntStream.of(nums).sum();
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i-1] >= nums[i]) {
				while(nums[i] <= nums[i-1]) {
					nums[i]++;
				}
			}
		}
		//System.out.println(Arrays.toString(nums));
		int newSum = IntStream.of(nums).sum();
		
		return newSum - oldSum;
	}

}
