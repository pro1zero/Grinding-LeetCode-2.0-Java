
public class monotoneIncreasingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(optimal(143));
	}
	
	public static int optimal(int num) {
		if(num < 10)
			return num;
		
		
		char[] nums = String.valueOf(num).toCharArray();
		int length = nums.length;
		
		for(int i = nums.length - 1; i >0; i--) {
			if(nums[i - 1] > nums[i]) {
				length = i - 1;
				nums[i-1]--;
			}
		}
		
		for(int i = length + 1; i < nums.length; i++) {
			nums[i] = '9';
		}
		return Integer.parseInt(new String(nums));
	}
	
	
}
