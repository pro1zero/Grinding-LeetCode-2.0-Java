
public class reverseWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   a good   example    ";
		System.out.println(reverse(s));
	}
	
	public static String reverse(String s) {
		s = s.strip();
		
		String[] words = s.split("\\s+");
		s = "";
		
		for(int i = words.length - 1; i >= 0; i--) {
			s += words[i] + " ";
		}
		return s.strip();
	}

}
