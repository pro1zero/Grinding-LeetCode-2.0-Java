
public class findFirstAndLast {

	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		System.out.println(firstAndLast(nums, 8));
	}
	
	public static int[] firstAndLast(int[] nums, int target){
		int left = 0;
		int right = nums.length - 1;
		int pivot = -1;
		while(left <= right) {
			int mid = (left + right)/2;
			if(nums[mid] == target) {
				pivot = mid;
				break;
			}
			else if(nums[mid] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		System.out.println(pivot);
		return pivot == -1?new int[] {-1, -1}:getRange(pivot, nums);
	}
	
	public static int[] getRange(int pivot, int[] nums) {
		int[] range = {pivot, pivot};
		int left = pivot - 1;
		while(left >= 0 && nums[left] == nums[pivot]) {
			range[0] = left;
			left--;
		}
		int right = pivot + 1;
		while(right < nums.length && nums[right] == nums[pivot]) {
			range[1] = right;
			right++;
		}
		return range;
	}

}
