import java.util.stream.IntStream;

public class checkIfArrayPairsAreDivisibleByK {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,10,6,7,8,9};
		System.out.println(ifDivisible(nums, 5));
	}
	
	public static boolean ifDivisible(int[] nums, int k) {
		int sum = IntStream.of(nums).sum();
		boolean flag = (sum%k == 0);
		return flag && (sum > k || sum == 0);
	}

}
