
public class maximumNestingDepth {

	public static void main(String[] args) {
		System.out.println(calc("(((1)))"));
	}
	
	public static int calc(String s) {
		int deepest = 0;
		int current = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				current += 1;
			}else if(s.charAt(i) == ')') {
				current -= 1;
			}
			deepest = Math.max(deepest, current);
		}
		return deepest;
	}

}
