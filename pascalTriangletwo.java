import java.util.*;
public class pascalTriangletwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculate(5));
	}	
	
	public static List<Integer> calculate(int n){
		List<Integer> result = new ArrayList<>();
		result.add(1);
		if(n == 0)
			return result;
		
		for(int i = 1; i <= n; i++) {
			List<Integer> prev = result;
			result.clear();
			result.add(1);
			for(int j = 1; j < i; j++) {
				if(prev.size() == 1)
					continue;
				result.add(prev.get(j-1) + prev.get(j));
			}
			result.add(1);
		}
		return result;
	}

}
