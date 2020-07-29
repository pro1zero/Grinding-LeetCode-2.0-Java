import java.util.*;
public class stringPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(permuteStrings("cat"));
	}
	
	public static List<String> permuteStrings(String s) {
		List<String> permutations = new ArrayList<>();
		if(s.isEmpty())
			return permutations;
		List<Character> temp = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			temp.add(s.charAt(i));
		}
		helper(0, temp, permutations);
		return permutations;
	}
	
	public static List<String> helper(int i, List<Character> temp, List<String> permutations){
		if(i == temp.size() - 1) {
			String s = (new ArrayList<>(temp)).toString();
			permutations.add(s);
		}else {
			for(int j = i; j < temp.size(); j++) {
				swap(i, j, temp);
				helper(i+1, temp, permutations);
				swap(i, j, temp);
			}
		}
		return permutations;
	}
	
	public static void swap(int i, int j, List<Character> temp) {
		char c = temp.get(i);
		temp.set(i, temp.get(j));
		temp.set(j, c);
	}

}
