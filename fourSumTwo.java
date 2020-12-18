import java.util.*;
public class fourSumTwo {

	public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = {-2,-1};
		int[] c = {-1,2};
		int[] d = {0,2};
		System.out.println(fourSum(a, b, c, d));
	}
	
	public static int fourSum(int[] a, int[] b, int[] c, int[] d) {
		Map<Integer, Integer> map1 = new HashMap<>();
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				int sum = a[i] + b[j];
				map1.put(sum, map1.getOrDefault(sum, 0) + 1);
			}
		}
		int result = 0;
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < d.length; j++) {
				int sum = c[i] + d[j];
				if(map1.containsKey((sum*-1))){
					result += map1.get((sum*-1));
				}
			}
		}
		return result;
	}

}
