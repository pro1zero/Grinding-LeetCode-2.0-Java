import java.util.*;
public class countContainedPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPermutations("cbabcacabca", "abc"));
	}
	
	public static int findPermutations(String big, String small) {
		int result = 0;
		Map<Character, Integer> smallCounts = new HashMap<>();
		for(char c: small.toCharArray()) {
			smallCounts.put(c, smallCounts.getOrDefault(c, 0) + 1);
		}
		System.out.println(smallCounts);
		int i = 0;
		int j = small.length() - 1;
		while(j < big.length()) {
			String newString = big.substring(i, j + 1);
			Map<Character, Integer> map = buildMap(newString);
			if(map.equals(smallCounts)) {
				result += 1;
			}
			i += 1;
			j += 1;
			
		}
		return result;
	}
	
	public static Map<Character, Integer> buildMap(String s){
		Map<Character, Integer> smallCounts = new HashMap<>();
		for(char c: s.toCharArray()) {
			smallCounts.put(c, smallCounts.getOrDefault(c, 0) + 1);
		}
		return smallCounts;
	}
}
	
//	public static int findPermutations(String big, String small) {
//		List<Character> array = new ArrayList<>();
//		for(char c: small.toCharArray()) {
//			array.add(c);
//		}
//		List<List<Character>> permutations = new ArrayList<>();
//		int result = 0;
//		permutations = helper(0, array, permutations);
//		for(List<Character> permutation: permutations) {
//			String s = "";
//			for(char c: permutation) {
//				s += c;
//			}
//			
//			System.out.println(s);
//			if(big.contains(s))
//				result += 1;
//		}
//		return result;
//	}
//	
//	public static List<List<Character>> helper(int i, List<Character> nums, List<List<Character>> permutations){
//		if(i == nums.size() - 1) {
//			permutations.add(new ArrayList<>(nums));
//		}
//		else {
//			for(int j = i; j < nums.size(); j++) {
//				swap(i, j, nums);
//				helper(i+1, nums, permutations);
//				swap(i, j, nums);
//			}
//		}
//		return permutations;
//	}
//	
//	public static void swap(int i, int j, List<Character> nums) {
//		char temp = nums.get(i);
//		nums.set(i, nums.get(j));
//		nums.set(j, temp);
//	}
//
//}
