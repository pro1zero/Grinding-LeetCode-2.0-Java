
public class threeConsOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,34,3,4,5,7,23,12};
		System.out.println(countOdds(nums));
	}
	
	public static boolean countOdds(int[] nums) {
		for(int i = 0; i < nums.length - 2; i++) {
			if(nums[i] % 2 != 0 && nums[i+1] % 2 != 0 && nums[i+2] % 2 != 0) {
				return true;
			}
		}
		return false;
	}

}
