
public class slowestKey {

	public static void main(String[] args) {
		int[] nums = {9,29,49,50};
		System.out.println(slowest(nums, "cbcd"));
	}
	
	public static char slowest(int[] nums, String s) {
		char longest = s.charAt(0);
		int maxDiff = nums[0];
		for(int i = 1; i < s.length(); i++) {
			int currentDiff = nums[i] - nums[i-1];
			if(currentDiff > maxDiff) {
				longest = s.charAt(i);
				maxDiff = currentDiff;
			}
			else if(currentDiff == maxDiff) {
				longest = (s.charAt(i) > longest) ? s.charAt(i) : longest;
				maxDiff = currentDiff;
			}
		}
		return longest;
	}
}
