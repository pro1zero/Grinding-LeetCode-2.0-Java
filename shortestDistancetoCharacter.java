import java.util.*;
public class shortestDistancetoCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "loveleetcode";
		System.out.println(shortest(s, 'e'));
	}
	
	public static int[] shortest(String s, char c) {
		int[] result = new int[s.length()];
		Arrays.fill(result, Integer.MAX_VALUE);
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				result[i] = 0;
			}
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(result[i] == 0) {
				int left = i - 1;
				int right = i + 1;
				int leftCount = 1;
				int rightCount = 1;
				while(left >= 0 && s.charAt(left) != c) {
					result[left] = Math.min(leftCount, result[left]);
					leftCount++;
					left--;
				}
				while(right < s.length() && s.charAt(right) != c) {
					result[right] = Math.min(rightCount, result[right]);
					rightCount++;
					right++;
				}
			}
		}
		return result;
	}

}
