
public class distanceBetweenBusStops {

	public static void main(String[] args) {
		int[] nums = {7,10,1,12,11,14,5,0};
		System.out.println(lowestSum(nums, 7, 2));
	}
	
	public static int lowestSum(int[] nums, int start, int end) {
		int sum1 = 0, sum2 = 0;
		int m = start, n = end;
		if(start > end) {
			m = end;
			n = start;
		}
		for(int i = 0; i < nums.length; i++) {
			if(i >= m && i < n) {
				sum2 += nums[i];
				continue;
			}
			sum1 += nums[i];
		}
		return Math.min(sum1, sum2);
	}
}
