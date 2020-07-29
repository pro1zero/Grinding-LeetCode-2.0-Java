import java.util.Arrays;

public class uglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ugly(10));
		System.out.println(isUgly(10));
	}
	
	public static int ugly(int n) {
		int[] dp = new int[n];
		dp[0] = 1;
		int index2 = 0, index3 = 0, index5 = 0;
		int two = 2, three = 3, five = 5; 
		
		for(int i = 1; i<n;i++) {
			int min = Math.min(Math.min(two, three), five);
			dp[i] = min;
			
			if(two == min) {
				index2++;
				two = 2 * dp[index2];
			}
			if(three == min) {
				index3++;
				three = 3 * dp[index3];
			}
			if(five == min) {
				index5++;
				five = 5 * dp[index5];
			}
		}
		System.out.println(Arrays.toString(dp));
		return dp[n-1];	
	}
	
	
	public static boolean isUgly(int n) {
		for(int i = 2;i<6 && n > 0;i++) {
			while(n % i == 0) {
				n /= i;
			}
		}
		return (n == 1);
	}

}
