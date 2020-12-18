import java.util.*;
public class pathCrossing {

	public static void main(String[] args) {
		System.out.println(calcPaths("NES"));
	}
	
	public static boolean calcPaths(String s) {
		Map<String, Boolean> map = new HashMap<>();
		map.put("00", true);
		int x = 0, y = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'N') {
				x += 1;
			}
			else if(c == 'S') {
				x -= 1;
			}
			else if(c == 'E') {
				y += 1;
			}
			else {
				y -= 1;
			}
			String toAdd = Integer.toString(x) + Integer.toString(y);
			if(map.containsKey(toAdd)) {
				return true;
			}
			map.put(toAdd, true);
		}
		return false;
	}
}
