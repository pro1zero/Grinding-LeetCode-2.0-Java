
public class palindromicSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindromic("abc"));
	}
	
	public static int palindromic(String s) {
		if(s.length() == 0)
			return 1;
		int result = 0;
		for(int i = 0; i<s.length();i++) {
			String temp = "";
			for(int j = i; j<s.length();j++) {
				temp += s.charAt(j);
				if(check(temp, result)) {
					result += 1;
				}
			}
		}
		return result;
	}
	
	public static boolean check(String s, int res) {
		int left = 0, right = s.length() - 1;
		
		while(left <= right) {
			if(!(s.charAt(left) == s.charAt(right))) {
				return false;
			}
			else {
				left++;
				right--;
			}
		}
		return true;
	}

}
