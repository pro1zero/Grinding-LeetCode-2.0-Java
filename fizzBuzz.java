import java.util.*;
public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFizz(5));
	}
	
	public static List<String> getFizz(int n) {
        List<String> result  = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String s = "";
            if(i%15 == 0){
                s += "FizzBuzz";	
            }else if(i%3 == 0){
                s += "Fizz";
            }
            else if(i%5 == 0){
                s += "Buzz";
            }
            else{
                s += Integer.toString(i);
            }
            result.add(s);
        }
        return result;
    }

}
