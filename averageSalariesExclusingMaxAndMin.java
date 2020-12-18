
public class averageSalariesExclusingMaxAndMin {

	public static void main(String[] args) {
		int[] nums = {6000,5000,4000,3000,2000,1000};
		System.out.println(avgSalaries(nums));
	}
	
	public static double avgSalaries(int[] nums) {
		double maxSalary = Integer.MIN_VALUE;
		double minSalary = Integer.MAX_VALUE;
		double total = 0;
		for(int i = 0; i < nums.length; i++) {
			total += nums[i];
			maxSalary = Math.max(maxSalary, nums[i]);
			minSalary = Math.min(minSalary, nums[i]);
		}
		return (total - maxSalary - minSalary)/(nums.length - 2);
	}

}
