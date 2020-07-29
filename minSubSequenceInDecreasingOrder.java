import java.util.*;
public class minSubSequenceInDecreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {6};
		System.out.println(sequence(nums));
	}
	
	public static List<Integer> sequence(int[] nums){
		List<Integer> result = new ArrayList<>();
		if(nums.length == 0)
			return result;
		int sum = 0;
		for(int i = 0; i<nums.length;i++) {
			sum += nums[i];
			nums[i] *= -1;
		}
		Arrays.sort(nums);
		
		for(int i = 0; i<nums.length;i++) {
			nums[i] *= -1;
		}
		int newSum = 0;
		int p = 0;
		while(newSum <= sum - newSum) {
			newSum += nums[p];
			result.add(nums[p]);
			p++;
		}
		return result;
	}

}
