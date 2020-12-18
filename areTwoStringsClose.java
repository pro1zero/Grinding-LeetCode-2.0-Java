import java.util.*;
public class areTwoStringsClose {

	public static void main(String[] args) {
		System.out.println(areClose("abbzzca", "babzzcz"));
	}
	
	public static boolean areClose(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		for(int i = 0; i < s1.length(); i++) {
			set1.add(s1.charAt(i));
			set2.add(s2.charAt(i));
			map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
			map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
		}
		if(!(set1.equals(set2))) return false;
		
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		for(char i: map1.keySet()) {
			l1.add(map1.get(i));
		}
		for(char i: map2.keySet()) {
			l2.add(map2.get(i));
		}
		Collections.sort(l1);
		Collections.sort(l2);
//		System.out.println(l1);
//		System.out.println(l2);
		return l1.equals(l2);
	}

}
