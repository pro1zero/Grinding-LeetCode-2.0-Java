import java.util.*;

public class sortCharactersByFrequency {

	public static void main(String[] args) {
		System.out.println(sortByChars("Aabb"));
	}
	
	public static String sortByChars(String s) {
		if(s.isEmpty())
			return "";
		Map<Character, Integer> map = new HashMap<>();
		for(char c: s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		PriorityQueue<Character> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
		for(char c: map.keySet()) {
			heap.offer(c);
		}
		String result = "";
		while(heap.size() > 0) {
			String temp = "";
			char c = heap.poll();
			int count = map.get(c);
			while(count > 0) {
				count--;
				temp += c;
			}
			result += temp;
		}
		return result;
	}
}
