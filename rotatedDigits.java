import java.util.*;
public class rotatedDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validNums(857));
	}
	
	public static int validNums(int end) {
		int result = 0;
		int[] dp = new int[end + 1];
		Set<Integer> s1 = Set.of(0,1,8);
		Set<Integer> s2 = Set.of(2,5,6,9);
		
		for(int i = 0; i < Math.min(10, end + 1); i++) {
			if(s1.contains(i))
				dp[i] = 1;
			else if(s2.contains(i)) {
				dp[i] = 2;
				result++;
			}
		}
		
		for(int i = 10; i <= end; i++) {
			int a = dp[i/10];
			int b = dp[i%10];
			
			if(a == 1 && b == 1) {
				dp[i] = 1;
			}
			else if(a >= 1 && b >= 1) {
				dp[i] = 2;
				result++;
			}
		}
		return result;
	}

}
