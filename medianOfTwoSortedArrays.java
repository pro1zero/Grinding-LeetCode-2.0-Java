import java.util.*;
public class medianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {};
		int[] nums2 = {3, 4};
		
		System.out.println(medians(nums1, nums2));
	}
	
	public static double medians(int[] nums1, int[] nums2) {
		int[] total = new int[nums1.length + nums2.length];
		
		for(int i = 0; i < nums1.length; i++) {
			total[i] = nums1[i];
		}
		int p = 0;
		for(int i = nums1.length; i < total.length; i++) {
			total[i] = nums2[p++];
		}
		System.out.println(Arrays.toString(total));
		return calculateMedian(total);
	}
	
	public static double calculateMedian(int[] total) {
		if(total.length %2 == 0) {
			double result = total[(total.length/2) - 1] + total[total.length/2];
			return result/2;
		}
		
		return total[total.length/2];
	}

}
