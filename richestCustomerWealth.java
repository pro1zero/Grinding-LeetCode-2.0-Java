import java.util.Arrays;
public class richestCustomerWealth {

	public static void main(String[] args) {
		int[][] accounts = {{1,2}, {3,4}};
		System.out.println(findMax(accounts));
	}

	public static int findMax(int[][] accounts) {
		return Arrays.stream(accounts).mapToInt(i -> Arrays.stream(i).sum()).max().getAsInt();
	}
}
