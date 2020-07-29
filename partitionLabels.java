import java.util.*;
public class partitionLabels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(partition("ababcbacadefegdehijhklij"));
	}
	
	public static List<Integer> partition(String s){
		List<Integer> result = new ArrayList<>();
		if(s.isEmpty()) return result;
		int[] ends = new int[26];
		for(int i = 0; i < s.length(); i++) {
			ends[s.charAt(i) - 'a'] = i;
		}
		int i = 0;
		while(i < s.length()) {
			int end = ends[s.charAt(i) - 'a'];
			int j = i;
			while(j != end) {
				end = Math.max(end, ends[s.charAt(j++) - 'a']);
			}
			result.add(j - i + 1);
			i = j + 1;
		}
		return result;
	}
}
