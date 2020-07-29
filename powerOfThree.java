
public class powerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerOfThreee(243));
	}
	
	public static boolean powerOfThreee(int n) {
		return (Math.log10(n)/Math.log10(3)%1 == 0);
	}
}