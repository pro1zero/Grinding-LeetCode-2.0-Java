import java.util.stream.IntStream;
public class stoneGameV {

	public static void main(String[] args) {
		int[] nums = {6,2,3,4,5,5};
		System.out.println(maxStones(nums));
	}
	
	public static int maxStones(int[] nums) {
		if(nums.length == 1)
			return 0;
		int totalSum = IntStream.of(nums).sum();
		
		return -1;
	}

}
