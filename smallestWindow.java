
public class smallestWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validation("qploresinazxrhqknhoilerthf", "lion"));
		System.out.println(validation("MKWPLNHNNKLASOPQLRHLI", "HILL"));
		System.out.println(validation("lqnkyp098fSkkmnQryS9pkYn0Qd7mksy0fRW0a7Sxzc", "Sky07"));
	}
	
	public static String validation(String str, String letters) {
		int smallest = Integer.MAX_VALUE;
		String result = "";
		for(int i = 0; i<str.length();i++) {
			String temp = "";
			for(int j = i; j<str.length();j++) {
				temp += str.charAt(j);
				if(helper(temp, letters)) {
					smallest = Math.min(smallest, temp.length());
					if(smallest >= temp.length()) {
						result = temp;
						if(result.length() == 11) {
							System.out.println(result);
						}
					}
				}
			}
		}
		return result;
	}
	
	public static boolean helper(String temp, String letters) {
		if(temp.length() < letters.length())
			return false;
		
		for(int i = 0; i<letters.length();i++) {
			if(!temp.contains(letters.charAt(i) + "")) {
				return false;
			}
		}
		return true;
	}
}
