import java.util.Arrays;

public class validSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] puzzle = {{'1', '2', '3'}, {'2', '3', '1'}, {'1', '3', '2'}};
		System.out.println(validate(puzzle));
	}
	
	public static boolean validate(char[][] p) {
		int[] nums = new int[p.length + 1];
		for(int i = 0; i<p.length;i++) {
			for(int j = 0; j<p[i].length;j++) {
				if(Character.isDigit(p[i][j])) {
					int temp = Integer.parseInt(p[i][j] + "");
					nums[temp]++;
				}
			}
			for(int k = 1; k<nums.length;k++) {
				if(nums[k]>=2)
					return false;
			}
			Arrays.fill(nums, 0);
		}
		
		Arrays.fill(nums, 0);
		
		for(int i = 0; i<p.length;i++) {
			for(int j = 0; j<p[i].length;j++) {
				if(Character.isDigit(p[j][i])) {
					int temp = Integer.parseInt(p[j][i] + "");
					nums[temp]++;
				}
			}
			for(int k = 1; k<nums.length;k++) {
				if(nums[k]>=2)
					return false;
			}
			Arrays.fill(nums, 0);
		}
		
		Arrays.fill(nums, 0);
		
		for(int i = 0; i<p.length;i++) {
			for(int j = 0; j<p[i].length;j++) {
				if(Character.isDigit(p[i][j])) {
					int temp = Integer.parseInt(p[i][j] + "");
					nums[temp]++;
				}
			}
		}
		
		for(int i = 1; i<nums.length;i++) {
			if(nums[i]>=4)
				return false;
		}
		return true;
	}

}
