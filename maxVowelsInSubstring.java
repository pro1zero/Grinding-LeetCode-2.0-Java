import java.util.HashSet;
import java.util.Set;

public class maxVowelsInSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMax("weallloveyou", 7));
		System.out.println(optimal("weallloveyou", 7));
	}
	
	public static int findMax(String s, int k) {
		if(s.length() == 0 || k == 0)
			return 0;
		
		int result = 0;
		
		for(int i = 0; i <= s.length() - k; i++) {
			String shorted = s.substring(i,i+k);
			int running = calcVowels(shorted);
			result = Math.max(result, running);
		}
		return result;
	}
	
	public static int calcVowels(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'u')
				count++;
		}
		return count;
	}
	
	public static boolean check(char c)
	{
		return (c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'u');
	}
	
	public static int optimal(String s, int k) {
		if( s.length() == 0 || k == 0)
			return 0;
		
		int result = 0, count = 0;
		for(int i = 0; i < k; i++) {
			if(check(s.charAt(i)))
				count++;
		}
		result = count;
		for(int i = k; i < s.length();i++) {
			if(check(s.charAt(i-k)))
				count--;
			if(check(s.charAt(i)))
				count++;
			result = Math.max(result, count);
		}
		return result;	
	}

}
