import java.util.*;
public class tryHash {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		String ip = scan.nextLine();
		
		String[] words = ip.split("\\.");
		System.out.println(Arrays.toString(words));
	}

}
