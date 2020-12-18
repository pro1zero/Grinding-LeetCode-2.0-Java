
public class findTheWinnerOfArrayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,3,5,4,6,7};
		System.out.println(findWinner(nums, 2));
	}
	
	
	public static int findWinner(int[] nums, int k) {
		int winner = nums[0];
		int count = 0;
		for(int i = 1; i < nums.length; i++) {
			if(winner > nums[i])
				count += 1;
			else {
				winner = nums[i];
				count = 1;
			}
			if(count == k)
				return winner;
		}
		return winner;
	}
}
