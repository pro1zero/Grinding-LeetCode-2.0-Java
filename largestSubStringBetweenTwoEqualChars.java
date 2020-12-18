import java.util.Arrays;

public class largestSubStringBetweenTwoEqualChars {

	public static void main(String[] args) {
		System.out.println(findLongest("mgntdygtxrvxjnwksqhxuxtrv"));
	}
	
	public static int findLongest(String s) {
		int[] previous = new int[26];
		int[] first = new int[26];
		int[] maxDistance = new int[26];
		Arrays.fill(previous, -1);
		Arrays.fill(first, -1);
		Arrays.fill(maxDistance, -1);
		for(int i = 0; i < s.length(); i++) {
			if(first[s.charAt(i) - 'a'] == -1) first[s.charAt(i) - 'a'] = i;
			if(previous[s.charAt(i) - 'a'] == -1) {
				previous[s.charAt(i) - 'a'] = i;
			}
			else {
				maxDistance[s.charAt(i) - 'a'] = Math.max(i - previous[s.charAt(i) - 'a'] - 1, (first[s.charAt(i) - 'a'] != -1 ? i - first[s.charAt(i) - 'a'] - 1 : -1));
				previous[s.charAt(i) - 'a'] = i;
			}
		}
		int maxDist = Integer.MIN_VALUE;
		System.out.println(Arrays.toString(maxDistance));
		for(int i = 0; i < maxDistance.length; i++) {
			maxDist = Math.max(maxDist, maxDistance[i]);
		}
		return maxDist;
	}

}
