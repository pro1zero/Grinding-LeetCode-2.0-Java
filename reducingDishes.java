import java.util.*;
public class reducingDishes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] satisfaction = {-1,-4,-5};
		System.out.println(reduceDish(satisfaction));
	}
	
	public static int reduceDish(int[] s) {
		Arrays.sort(s);
		int maxSat = 0;
		int count = 0;
		for(int i = s.length - 1; i >= 0; i--) {
			count++;
			int max = 0;
			int p = count;
			for(int j = s.length - 1; j >= i; j--) {
				max += s[j]*p--;
			}
			
			maxSat = Math.max(max, maxSat); 
		}
		
		return maxSat;
	}

}
