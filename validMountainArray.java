
public class validMountainArray {

	public static void main(String[] args) {
		System.out.println(isValid(new int[] {5,4,3,2,1,0}));
	}
	
	public static boolean isValid(int[] nums) {
		if(nums.length < 3) return false;
		boolean decreasing = false;
		boolean increasing = false;
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] > nums[i+1]) {
				decreasing = true;
			}
			else if(nums[i] < nums[i+1] && !decreasing) {
				increasing = true;
				continue;
			}
			else return false;
		}
		return (true && decreasing && increasing);
	}

}
