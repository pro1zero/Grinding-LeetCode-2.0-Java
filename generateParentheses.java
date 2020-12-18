import java.util.*;
public class generateParentheses {

	public static void main(String[] args) {
		System.out.println(optimal(3));
//		System.out.println(generateparentheses(3));
	}
	
	
	public static List<String> optimal(int n){
		List<String> result = new ArrayList<>();
		backTrack(result, "", 0, 0, n);
		return result;
	}
	
	public static void backTrack(List<String> result, String current, int open, int close, int max) {
		if(current.length() == max * 2) {
			result.add(current);
			return;
		}
		if(open < max) {
			backTrack(result, current + "(", open + 1, close, max);
		}
		if(close < open) {
			backTrack(result, current + ")", open, close + 1, max);
		}
	}
	
	public static List<String> generateparentheses(int n){
		List<String> result = new ArrayList<>();
		String parentheses = "";
		for(int i = 1; i <= n; i++) parentheses += "()";
		List<Character> parent = new ArrayList<>();
		for(char c: parentheses.toCharArray()) {
			parent.add(c);
		}
		generateAll(parent, result);
		return result;
	}
	
	public static List<String> generateAll(List<Character> parent, List<String> result){
		helper(0, parent, result);
		return result;
	}
	
	public static void helper(int i, List<Character> parent, List<String> result) {
		if(i == parent.size() - 1) {
			String temp = "";
			for(int p = 0; p < parent.size(); p++) {
				temp += parent.get(p);
			}
			result.add(temp);
		}
		else {
			for(int j = i; j < parent.size(); j++) {
				swap(i, j, parent);
				helper(i+1, parent, result);
				swap(i, j, parent);
			}
		}
	}
	
	public static void swap(int i, int j, List<Character> parent) {
		char temp = parent.get(i);
		parent.set(i, parent.get(j));
		parent.set(j, temp);
	}
}
