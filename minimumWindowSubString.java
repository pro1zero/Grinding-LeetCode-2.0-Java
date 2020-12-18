import java.util.*;
public class minimumWindowSubString {

	public static void main(String[] args) {
		System.out.println(minWindow("ADOBECODEBANC", "ABC"));
	}
	public static String minWindow(String s, String t) {

	      if (s.length() == 0 || t.length() == 0) {
	          return "";
	      }

	      // Dictionary which keeps a count of all the unique characters in t.
	      Map<Character, Integer> dictT = new HashMap<Character, Integer>();
	      for (int i = 0; i < t.length(); i++) {
	          int count = dictT.getOrDefault(t.charAt(i), 0);
	          dictT.put(t.charAt(i), count + 1);
	      }

	      // Number of unique characters in t, which need to be present in the desired window.
	      int required = dictT.size();

	      // Left and Right pointer
	      int l = 0, r = 0;

	      // formed is used to keep track of how many unique characters in t
	      // are present in the current window in its desired frequency.
	      // e.g. if t is "AABC" then the window must have two A's, one B and one C.
	      // Thus formed would be = 3 when all these conditions are met.
	      int formed = 0;

	      // Dictionary which keeps a count of all the unique characters in the current window.
	      Map<Character, Integer> windowCounts = new HashMap<Character, Integer>();

	      // ans list of the form (window length, left, right)
	      int[] ans = {-1, 0, 0};

	      while (r < s.length()) {
	          // Add one character from the right to the window
	          char c = s.charAt(r);
	          int count = windowCounts.getOrDefault(c, 0);
	          windowCounts.put(c, count + 1);

	          // If the frequency of the current character added equals to the
	          // desired count in t then increment the formed count by 1.
	          if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
	              formed++;
	          }

	          // Try and contract the window till the point where it ceases to be 'desirable'.
	          while (l <= r && formed == required) {
	              c = s.charAt(l);
	              // Save the smallest window until now.
	              if (ans[0] == -1 || r - l + 1 < ans[0]) {
	                  ans[0] = r - l + 1;
	                  ans[1] = l;
	                  ans[2] = r;
	              }

	              // The character at the position pointed by the
	              // `Left` pointer is no longer a part of the window.
	              windowCounts.put(c, windowCounts.get(c) - 1);
	              if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
	                  formed--;
	              }

	              // Move the left pointer ahead, this would help to look for a new window.
	              l++;
	          }

	          // Keep expanding the window once we are done contracting.
	          r++;   
	      }

	      return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
	  }
	
	public static String minWindows(String big, String small) {
		if(big.length() == 0 || small.length() == 0) {
			return "";
		}
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < small.length(); i++) {
			map.put(small.charAt(i), map.getOrDefault(small.charAt(i), 0) + 1);
		}
		int required = map.size();
		int left = 0, right = 0;
		int formed = 0;
		Map<Character, Integer> runningMap = new HashMap<>();
		int[] result = {-1, 0, 0};
		while(right < big.length()) {
			char c = big.charAt(right);
			map.put(c, map.getOrDefault(c, 0) + 1);
			if(map.containsKey(c) && runningMap.get(c).intValue() == map.get(c).intValue()) {
				formed += 1;
			}
			while(left <= right && formed == required) {
				c = big.charAt(left);
				if(result[0] == -1 || right - left + 1 < result[0]) {
					result[0] = right - left + 1;
					result[1] = left;
					result[2] = right;
				}
				runningMap.put(c, runningMap.get(c) - 1);
				if(runningMap.containsKey(c) && runningMap.get(c).intValue() < runningMap.get(c).intValue()) {
					formed -= 1;
				}
				left += 1;
			}
			right += 1;
		}
		return result[0] == -1 ? "" : big.substring(result[1], result[2] + 1);
	}

}
