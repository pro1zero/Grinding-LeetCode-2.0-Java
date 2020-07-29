import java.util.*;
public class wordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(constructWordPattern("abba", "dog dog dog dog"));
	}
	
	public static boolean constructWordPattern(String p, String s) {
		if(p.isEmpty() && s.isEmpty()) {
			return true;
		}
		
		if(p.isEmpty() && s.isEmpty()) {
			return false;
		}
		
		String[] words = s.split(" ");
		if(words.length != p.length()) {
			return false;
		}
		Map<Character, String> map = new HashMap<>();
		for(int i = 0; i < p.length(); i++) {
			char c = p.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, words[i]);
			}
		}
		Set<String> set = new HashSet<>();
		
		for(char c: map.keySet()) {
			if(!set.contains(map.get(c))) {
				set.add(map.get(c));
			}
			else
				return false;
		}
		String result = "";
		for(int i = 0; i < p.length(); i++) {
			result += map.get(p.charAt(i)) + " ";
		}
		System.out.println(result);
		
		return s.equals(result.strip());
	}

}
