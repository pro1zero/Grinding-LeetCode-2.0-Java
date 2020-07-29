
public class numOfStepsToReduceToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(conversionTo("1101"));
	}
	
	public static int conversionTo(String s) {
		int i = Integer.parseInt(s, 2);
		
		int count = 0;
		while(i > 1) {
			if(i%2 == 0)
				i /= 2;
			else
				i += 1;
			count++;
		}
		return count;
	}

}
