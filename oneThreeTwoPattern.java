
public class oneThreeTwoPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,2,-2,1,2};
		System.out.println(check(nums));
	}
	
	public static boolean check(int[] nums) {
		if(nums.length < 3){
			return false;
		}
		
		int[] minSoFar = new int[nums.length];
		minSoFar[0] = nums[0];
		
		for(int i = 1; i<nums.length;i++) {
			minSoFar[i] = Math.min(minSoFar[i-1], nums[i]);
		}
		
		for(int i = 1; i< nums.length;i++) {
			if(nums[i] > minSoFar[i]) {
				int right = i+1;
				while(right < nums.length) {
					if(nums[i] > nums[right] && nums[right] > minSoFar[i])
						return true;
					right++;
				}
			}
		}
		
		return false;
	}
}
