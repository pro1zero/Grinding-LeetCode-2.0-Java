
public class countOddsInIntervalRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countOdds(8,10));
	}
	
	public static int countOdds(int low, int high) {
		if(low%2 == 0)
			low += 1;
		if(high%2 == 0)
			high -= 1;
		return (high - low)/2 + 1;
	}

}
