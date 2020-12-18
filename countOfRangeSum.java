import java.util.*;
public class countOfRangeSum {

	public static void main(String[] args) {
		int[] nums = {0,0};
		System.out.println(rangeSum(nums, 0, 0));
	}
	
	public static int rangeSum(int[] nums, int low, int high) {
		int n = nums.length;
		List<Long> list = new ArrayList<>();
		long[] sumSoFar = new long[nums.length];
		sumSoFar[0] = nums[0];
		for(int i = 1; i < nums.length; i++) {
			sumSoFar[i] += sumSoFar[i-1] + nums[i];
		}
		int j = 0, i = 0, k = 0;
		while(j < (n*(n+1))/2 && i < nums.length) {
			if(k > 0)
				list.add(sumSoFar[i++] - sumSoFar[k-1]);
			else
				list.add(sumSoFar[i++]);
			if(i == nums.length) {
				k++;
				i = k;
			}
			j++;
		}
		Collections.sort(list);
		int result = 0;
		for(long num: list) {
			if(num > high)
				break;
			if(num >= low && num <= high) {
				result++;
			}
		}
		return result;
	}

}
