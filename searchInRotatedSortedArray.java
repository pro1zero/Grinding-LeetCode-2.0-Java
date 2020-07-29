
public class searchInRotatedSortedArray {
	public static void main(String[] args) {
		int[] nums = {3,1};
		System.out.println(rotatedSearch(nums, 1));
	}
	
	public static int rotatedSearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		
		while(left <= right) {
			int mid = (left + right)/ 2;
			
			if(nums[mid] == target)
				return mid;
			
			else if(nums[left] <= nums[mid]) {
				if(target >= nums[left] && target < nums[mid]) {
					right = mid - 1;
					continue;
				}
				else {
					left = mid + 1;
					continue;
				}
			}
			else {
				if(target <= nums[right] && target > nums[mid]) {
					left = mid + 1;
					continue;
				}
				else {
					right = mid - 1;
					continue;
				}
			}
		}
		return -1;
	}
}
