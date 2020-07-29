import java.util.*;
public class sortCharsByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sortChars("jjjjjjaaaaaaaaaaaabbbbbbbbbbbbbbbbb"));
	}
	
	public static String sortChars(String s) {
		if(s.isEmpty())
			return s;
		
		int[] chars = new int[26];
		for(char c: s.toCharArray()) {
			chars[c - 'a']++;
		}
		String sortedString = "";
		
		while(sortedString.length() != s.length()) {
			int max = Integer.MIN_VALUE;
			char c = 'a';
			for(int i = 0; i < chars.length; i++) {
				if(max < chars[i]) {
					max = chars[i];
					int temp = 97 + i;
					c = (char) temp;
					chars[i] = -1;
				}
			}
			String temp = "";
			while(max != 0) {
				temp += c;
				max--;
			}
			sortedString += temp;
		}
		return sortedString;
	}

}
