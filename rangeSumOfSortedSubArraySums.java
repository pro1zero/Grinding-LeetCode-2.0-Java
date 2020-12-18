import java.util.*;
public class rangeSumOfSortedSubArraySums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		System.out.println(findSum(nums, 4, 1, 10));
	}
	
	public static int findSum(int[] nums, int n, int left, int right) {
		int[] result = new int[(n*(n+1))/2];
		int[] sumSoFar = new int[nums.length];
		sumSoFar[0] = nums[0];
		for(int i = 1; i < nums.length; i++) {
			sumSoFar[i] += sumSoFar[i-1] + nums[i];
		}
		int j = 0, i = 0, k = 0;
		while(j < (n*(n+1))/2 && i < nums.length) {
			if(k > 0)
				result[j++] = sumSoFar[i++] - sumSoFar[k-1];
			else
				result[j++] = sumSoFar[i++];
			if(i == nums.length) {
				k++;
				i = k;
			}
		}
		Arrays.sort(result);
		int sum = 0;
		for(int p = left - 1; p < right; p++) {
			sum%=(1000000007);
			sum += result[p];
		}
		return sum%(1000000007);
	}

}
