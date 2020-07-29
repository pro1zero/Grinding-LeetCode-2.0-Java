public class validPalinTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findValid("abca"));
	}
	
	public static boolean findValid(String s) {
		if(isPalin(s) || s.isEmpty())
			return true;
		
		int left = 0;
		int right = s.length() - 1;
		
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				String leftCharDeleted = s.substring(0, left) + s.substring(left + 1);
				String rightCharDeleted = s.substring(0, right) + s.substring(right + 1);
				return (isPalin(leftCharDeleted) || isPalin(rightCharDeleted));
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static boolean isPalin(String s) {
		int left = 0;
		int right = s.length() - 1;
		
		while(left <= right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			else {
				left++;
				right--;
			}
		}
		return true;
	}
}
