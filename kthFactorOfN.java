import java.util.*;
public class kthFactorOfN {

	public static void main(String[] args) {
		System.out.println(findKth(4,4));
	}
	
	public static int findKth(int n, int k) {
		if(n == 1 && k == 1)
			return 1;
		if(n == 1)
			return -1;
		List<Integer> factors = new ArrayList<>();
		for(int i = 1; i <= n/2; i++) {
			if(n%i == 0) {
				factors.add(i);
			}
		}
		if(n != 1)
			factors.add(n);
		System.out.println(factors);
		return factors.size() >= k?factors.get(k-1):-1;
	}

}
