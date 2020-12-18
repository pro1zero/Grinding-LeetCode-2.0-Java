
public class numsOfOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findOnes("0110111"));
	}
	
	public static int findOnes(String s) {
		if(s.isEmpty())
			return 0;
		long totalOnes = 0;
		long streak = 0;
		for(char c: s.toCharArray()) {
			if(c == '0') {
				totalOnes += ((streak * (streak + 1)) / 2);
				streak = 0;
			}
			if(c == '1') {
				streak += 1;
			}
		}
		long m = 1000000007;
		long change = totalOnes += ((streak * (streak + 1)) / 2);
		return (int) (s.charAt(s.length() - 1) == '1'? change%m : totalOnes%m);
	}

}
