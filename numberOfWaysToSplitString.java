
public class numberOfWaysToSplitString {

	public static void main(String[] args) {
		System.out.println(totalWays("10101"));
	}
	
	public static int totalWays(String s) {
		int count = 0;
		int mod = 1000000007;
		for(char c: s.toCharArray()) {
			if(c == '1')
				count += 1;
		}
		if(count % 3 != 0 || s.length() < 3) return 0;
		if(count == 0) return (int) ((((long) (s.length() - 1) * (long) (s.length() - 2))/2) % mod);
		int current = 0;
		int left = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				current += 1;
			}
			if(current == count/3) left++;
			else if(current > count/3) break;
		}
		current = 0;
		int right = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == '1') {
				current += 1;
			}
			if(current == count/3) right++;
			else if(current > count/3) break;
		}
		return (int) (((long) left * (long) right) % mod);
	}

}
