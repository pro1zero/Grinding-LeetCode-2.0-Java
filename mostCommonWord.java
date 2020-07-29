import java.util.*;
public class mostCommonWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String para = "abc abc? abcd the jeff!";
		String[] words = {"abc","abcd", "jeff"};
		System.out.println(mostCommon(para, words));
	}
	
	public static String mostCommon(String p, String[] words) {
		List<String> banned = new ArrayList<>(Arrays.asList(words));
		p = p.replaceAll("[!]", " ");
		p = p.replaceAll("[?]", " ");
		p = p.replaceAll("[']", " ");
		p = p.replaceAll("[,]", " ");
		p = p.replaceAll("[;]", " ");
		p = p.replaceAll("[.]"," ");
		String[] wordsFromPara = p.split("\\s+");
		Map<String, Integer> map = new HashMap<>();
		for(String word: wordsFromPara) {
			map.put(word.toLowerCase(), map.getOrDefault(word.toLowerCase(), 0) + 1);
		}
		PriorityQueue<String> heap = new PriorityQueue<String>((a, b) -> map.get(b) - map.get(a));
		for(String word: map.keySet()) {
			heap.offer(word);
		}
		int length = heap.size();
		for(int i = 0; i < length; i++) {
			String temp = heap.poll();
			if(!banned.contains(temp)) {
				return temp;
			}
		}
		return "-1";
	}

}
