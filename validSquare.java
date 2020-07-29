import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class validSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validSq(new int[] {0,1}, new int[] {1,0}, new int[] {0,0}, new int[] {1,1}));
	}
	
	public static boolean validSq(int[] p1, int[] p2, int[] p3, int[] p4) {
		List<int[]> coordinates = new ArrayList<>();	
		coordinates.add(p1);
		coordinates.add(p2);
		coordinates.add(p3);
		coordinates.add(p4);
		
		Collections.sort(coordinates, (c1, c2) -> Integer.compare(c1[0], c2[0]));
		System.out.println(coordinates);
		for(int i = 0; i < coordinates.size(); i++) {
			System.out.println(Arrays.toString(coordinates.get(i)));
		}
		return false;
	}
}
