import java.util.*;
public class scoreOfParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calc("(()(()))"));
	}
	
	public static int calc(String s) {
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for(char c: s.toCharArray()) {
			if(c == '(') {
				stack.push(0);
			}else {
				int v = stack.pop();
				int w = stack.pop();
				stack.push(w + Math.max(v*2, 1));
			}
		}
		return stack.pop();
	}

}
