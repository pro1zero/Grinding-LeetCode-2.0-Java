
public class diagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		System.out.println(calc(nums));
	}
	
	public static int calc(int[][] nums) {
		if(nums.length == 1)
			return nums[0][0];
		int sum = 0;
		for(int i = 0, j = nums.length - 1; i < nums.length && j >= 0; i++, j--) {
			sum += nums[i][i] + nums[i][j];
		}
		return (nums.length%2 != 0)?sum - nums[nums.length/2][nums.length/2]:sum;
	}
}