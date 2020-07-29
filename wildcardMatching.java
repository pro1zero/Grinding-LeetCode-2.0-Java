
public class wildcardMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wildcard("abcdefg", "a*e?g"));
	}
	
	public static boolean wildcard(String s, String p) {
		boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
		dp[0][0] = true;
		for(int i = 1; i <= p.length(); i++) {
			if(p.charAt(i-1) == '*')
				dp[i][0] = true;
			else
				break;
		}
		for(int i = 1; i <= s.length(); i++) {
			for(int j = 1; j <= p.length(); j++) {
				if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') {
					dp[i][j] = dp[i-1][j-1];
				}
				else if(p.charAt(j-1) == '*') {
					dp[i][j] = dp[i-1][j] || dp[i][j-1];
				}else {
					dp[i][j] = false;
				}
			}
		}
		return dp[s.length()][p.length()];
	}

}
