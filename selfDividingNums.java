import java.util.*;
public class selfDividingNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(naive(1, 22));
	}
	
	public static List<Integer> naive(int left, int right){
		List<Integer> result = new ArrayList<>();
		for(int i = left; i<= right;i++) {
			boolean flag = check(i);
			if(flag)
				result.add(i);
		}
		return result;
	}
	
	public static boolean check(int i) {
		if(i < 10)
			return true;
		
		String temp = Integer.toString(i);
		if(temp.contains("0"))
			return false;
		
		for(int j = 0; j<temp.length();j++) {
			if(!(i % Integer.parseInt((temp.charAt(j) + "")) == 0)){
				return false;
			}
		}
		return true;
	}

}
