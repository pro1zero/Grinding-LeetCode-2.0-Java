
public class minOperationToMakeArraySame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeSame(4));
	}
	
	public static int makeSame(int n) {
		int sum = 0;
		int m = 1;
		int pin = (1 + (2*n - 1))/2;
		while(pin - m > 0) {
			sum += pin - m;
			m += 2;
		}
		return sum;
	}

}
