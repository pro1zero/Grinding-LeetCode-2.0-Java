import java.util.*;
public class topKFrequentWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
		System.out.println(topK(words, 2));
	}
	
	public static List<String> topK(String[] words, int k){
		Map<String, Integer> map = new HashMap<>();
		for(String word: words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		PriorityQueue<String> heap = new PriorityQueue<>((a, b) -> map.get(b).equals(map.get(a)) ? a.compareTo(b): map.get(b) - map.get(a));
		for(String word: map.keySet()) {
			heap.offer(word);
		}
		List<String> result = new ArrayList<>();
		for(int i = 0; i < k; i++) {
			result.add(heap.poll());
		}
		return result;
	}
}