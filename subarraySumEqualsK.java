
public class subarraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,0,0,0,0,0,0,0,0};
		System.out.println(calculate(nums, 0));
	}
	
	public static int calculate(int[] nums, int k) {
		int result = 0;
		
		for(int i = 0; i<nums.length;i++) {
			int sum = 0;
			for(int j = i; j<nums.length;j++) {
				sum += nums[j];
				if(sum == k) {
					result++;
				}
			}
		}
		return result;
	}
}
