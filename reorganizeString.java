import java.util.*;
public class reorganizeString {

	public static void main(String[] args) {
		System.out.println(isValid("aab"));
	}
	
	public static String isValid(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		boolean isEven = s.length() % 2 == 0 ? true : false;
		if(isEven) {
			for(char c: map.keySet()) {
				if(map.get(c) > s.length()/map.size()) {
					return "";
				}
			}
		}
		return null;
	}
}
