
public class searchInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,0,1,2,3};
		System.out.println(naive(nums, 6));
	}
	
	public static int naive(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		
		while(low < high) {
			int mid = (low + high)/2;
			int num = nums[mid];
			
			if((nums[mid] < nums[0]) ==(target < nums[0])) {
				num = nums[mid];
			}
			else {
				num = target < nums[0]?Integer.MIN_VALUE:Integer.MAX_VALUE;
			}
			
			if(num < target) {
				low = mid + 1;
			}
			else if(num > target) {
				high = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}
