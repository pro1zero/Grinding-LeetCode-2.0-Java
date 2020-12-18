
public class detectPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(detect(new int[] {1,2,1,2,1,1,1,3}, 2, 2));
	}
	
	public static boolean detect(int[] nums, int m, int k) {
		int count = 0;
		for(int i = 0; i + m < nums.length; i++) {
			count = (nums[i] == nums[i + m])? count + 1:0;
			if(count == ((k-1)*m)) return true;
		}
		return false;
	}
}
