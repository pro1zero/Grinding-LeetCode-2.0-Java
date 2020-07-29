
public class reversePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
		System.out.println(reversePair(nums));
		System.out.println(reversePairOnePass(nums));
	}
	
	public static int reversePair(int[] nums) {
		if(nums.length < 2) {
			return 0;
		}
		int pairs = 0;
		
		int left = 0;
		int right = nums.length - 1;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]*2)
					pairs++;
			}
		}
		
		return pairs;
	}
	
	public static int reversePairOnePass(int[] nums) {
		if(nums.length < 2)
			return 0;
		
		int pairs = 0;
		
		int left = 0;
		int right = nums.length - 1;
		
		while(left < nums.length) {
			if(left >= nums.length || right < 0)
				break;
			
			if(nums[left] > nums[right]*2 && left != right) {
				pairs += 1;
				right--;
				continue;
			}
			
			if(right == left) {
				right = nums.length - 1;
				left++;
				continue;
			}
			
			right--;
		}
		return pairs;
	}

}
