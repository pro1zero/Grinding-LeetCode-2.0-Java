public class shuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shuffle("aiohn", new int[] {3,1,4,2,0}));
	}
	
	public static String shuffle(String s, int[] indices) {
		char[] result = new char[s.length()];
		for(int i = 0; i < indices.length; i++) result[indices[i]] = s.charAt(i);
		return new String(result);
	}

}
