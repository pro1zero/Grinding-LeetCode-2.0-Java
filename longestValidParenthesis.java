import java.util.*;
public class longestValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()()";
//		System.out.println(naive(s));
		System.out.println(twoPointers(s));
		//System.out.println(usingStack(s));
	}
	
	
	public static int usingStack(String s) {
		List<Character> stack = new ArrayList<>();
		return -1;
	}
	
	public static int twoPointers(String s) {
		int left = 0; int right = 0;
		int maxLength = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(')
				left++;
			else
				right++;
			if(left == right) {
				maxLength = Math.max(maxLength, left + right);
			}
			else if(right >= left) {
				left = right = 0;
			}		
		}
		left = 0;
		right = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if(c == ')')
				right++;
			else
				left++;
			if(left == right) {
				maxLength = Math.max(i, left + right);
			}
			else if(left >= right) {
				left = right = 0;
			}
		}
		return maxLength;
	}
	
	public static int naive(String s) {
		if(s.isEmpty())
			return 0;
		int longestValidLength = 0;
		for(int i = 0; i<s.length() - 1;i++) {
			for(int j = i+1; j<=s.length();j++) {
				String result = s.substring(i, j);
				boolean flag = check(result);
				if(flag) longestValidLength = Math.max(longestValidLength, result.length());
			}
		}
		return longestValidLength;
	}
	
	public static boolean check(String result) {
		if(result.length()%2 != 0) {
			return false;
		}
		
		List<Character> stack = new ArrayList<>();
		Map<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		
		for(int i = 0; i<result.length();i++) {
			if(result.charAt(i) == '(') {
				stack.add(result.charAt(i));
			}
			else {
				if(stack.size() == 0)
					return false;
				
				String c = map.get(result.charAt(i)) + "";
				if(c.equals(stack.get(stack.size() - 1) + "")) {
					stack.remove(stack.size() - 1);
				}
				else {
					return false;
				}
			}
		}
		return stack.size() == 0;
	}
	
	
}
