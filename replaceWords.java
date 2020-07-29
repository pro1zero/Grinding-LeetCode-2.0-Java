import java.util.*;
public class replaceWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("cat", "rat", "bat", "r");
		String sentence = "the cattle was rattled by the battery";
		
		System.out.println(replaceWord(words, sentence));
	}
	
	public static String replaceWord(List<String> words, String sentence) {
		if(words.isEmpty() || words == null)
			return sentence;
		String[] temp = sentence.split(" ");
		for(int i = 0; i<words.size();i++) {
			for(int j = 0; j<temp.length;j++) {
				if(temp[j].contains(words.get(i)) && (words.get(i).charAt(0) == temp[j].charAt(0))) {
					temp[j] = words.get(i);
				}
			}
		}
		String result = "";
		for(int i = 0;i<temp.length;i++) {
			result += temp[i] + " ";
		}
		return result.strip();
	}
}
