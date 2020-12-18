import java.util.ArrayList;
import java.util.List;

public class splitPalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(splitPalin("abc"));
	}
	
	public static String splitPalin(String s) {
		if(s.isEmpty()) return "";
		List<String> palindromes = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			String s1 = expandFromMiddle(i, i, s);
			String s2 = expandFromMiddle(i, i + 1, s);
			if(s1.length() > s2.length())
				palindromes.add(s1);
			else
				palindromes.add(s2);
		}
		System.out.println(palindromes);
		return null;
	}
	
	public static String expandFromMiddle(int i, int j, String s) {
		while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
			i -= 1;
			j += 1;
		}
		return s.substring(i+1, j);
	}
}
