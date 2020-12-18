import java.util.*;
public class longestSubStringWithAtLeastKCharactersRepeating {

	public static void main(String[] args) {
		System.out.println(getLongestString("a", 1));
	}
	
	public static int getLongestString(String s, int k) {
		if(s.length() == 1 && k == 1)
			return 1;
		if(s.length() <= 1)
			return 0;
		int longestLength = 0;
		for(int i = 0; i < s.length(); i++) {
			for(int j = i+1; j < s.length(); j++) {
				String newStr = s.substring(i, j + 1);
				Map<Character, Integer> map = getCounts(newStr);
				boolean flag = checkCounts(map, k);
				if(flag) {
					longestLength = Math.max(longestLength, newStr.length());
				}
			}
		}
		return longestLength;
	}
	
	public static boolean checkCounts(Map<Character, Integer> map, int k) {
		for(char c: map.keySet()) {
			if(map.get(c) < k){
				return false;
			}
		}
		return true;
	}
	
	public static Map<Character, Integer> getCounts(String s){
		Map<Character, Integer> map = new HashMap<>();
		for(char c: s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		return map;
	}

}
