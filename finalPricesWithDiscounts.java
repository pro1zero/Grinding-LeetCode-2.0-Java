import java.util.*;
public class finalPricesWithDiscounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8,4,6,2,3};
		System.out.println(finalPrices(nums));
	}
	
	public static String finalPrices(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < nums.length; i++) {
			System.out.println("Iteration nums[i]: " + nums[i]);
			while(!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
				System.out.println("Inside while: " + stack.peek());
				nums[stack.pop()] -= nums[i];
			}
			stack.push(i);
		}
		return Arrays.toString(nums);
	}

}
