import java.util.*;
public class pascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pascalS(0));
	}
	
	public static List<Integer> pascalS(int k){
		List<List<Integer>> result = new ArrayList<>();
		
		List<Integer> first = new ArrayList<>();
		first.add(1);
		result.add(first);
		
		for(int i = 1; i <= k; i++) {
			List<Integer> prev = result.get(i-1);
			List<Integer> current = new ArrayList<>();
			current.add(1);
			
			for(int j = 1; j < i; j++) {
				current.add(prev.get(j-1) + prev.get(j));
			}
			current.add(1);
			result.add(current);
		}
		return result.get(k);
	}
}
