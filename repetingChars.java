import java.util.*;
public class repetingChars {

	public static void main(String[] args) {	
		System.out.println(rearrange("aab"));
	}
	
	public static String rearrange(String s) {
		if(s.length() < 1) return s;
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		PriorityQueue<Character> queue = new PriorityQueue<Character>((a, b) -> map.get(b) - map.get(a));
		queue.addAll(map.keySet());
		Queue<Character> waitList = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		while(!queue.isEmpty()) {
			Character current = queue.poll();
			sb.append(current);
			map.put(current, map.get(current) - 1);
			waitList.offer(current);
			if(waitList.size() < 2) continue;
			Character front = waitList.poll();
			if(map.get(front) > 0) queue.offer(front);
		}
		return sb.length() == s.length() ? sb.toString() : "";
	}
}
