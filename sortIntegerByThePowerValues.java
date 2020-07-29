import java.util.*;
public class sortIntegerByThePowerValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sortUsingPower(12, 15, 2));
	}
	
	public static int sortUsingPower(int low, int high, int k) {
		List<int[]> pairs = new ArrayList<>();
		
		for(int i = low; i <= high; i++) {
			int count = 0;
			int temp = i;
			while(temp != 1) {
				if(temp%2 != 0) {
					temp = temp*3 + 1;
				}
				else {
					temp /= 2;
				}
				count++;
			}
			
			pairs.add(new int[] {count, i});
		}
		
		 Collections.sort(pairs, (a, b) -> {
	            if (a[0] == b[0])
	                return a[1] - b[1];
	            return a[0] - b[0];
	     });
		 
		 return pairs.get(k-1)[1];
	}
}
