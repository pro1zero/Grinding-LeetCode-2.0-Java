
public class powerXN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcPower(2,-2147483648));
	}
	
	public static double calcPower(double x, int n) {
		
		if(n == 0)
			return 1;
		
		if(n < 0) {
			n = -n;
			x = 1/x;
		}
		return (n%2 == 0) ? calcPower(x*x, n/2) : x*calcPower(x*x, n/2);
	}
}
