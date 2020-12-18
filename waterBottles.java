
public class waterBottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(waters(5, 5));
	}
	
	public static int waters(int numBottles, int numExchange) {
		if(numBottles < numExchange)
			return numBottles;
		int full = numBottles;
		int empty = numBottles;
		while(empty > numExchange) {
			int cliff = empty % numExchange;
			int toAdd = (empty - cliff)/numExchange;
			full += toAdd;
			empty = cliff;
			empty += toAdd;  
		}
		full += empty/numExchange;
		return full;
	}

}
