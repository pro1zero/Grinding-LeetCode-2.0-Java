
public class minimumDominoRotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,1,2,4,2,2};
		int[] B = {5,2,6,2,3,2};
		System.out.println(minDomi(A, B));
	}
	
	public static int minDomi(int[] A, int[] B) {
		int minSwaps = 0;
		minSwaps = Math.min(Math.min(check(A[0], A, B), check(B[0], A, B)), Math.min(check(A[0], B, A), check(B[0], B, A)));
		return minSwaps == Integer.MAX_VALUE ? -1 : minSwaps;
	}
	
	public static int check(int target, int[] A, int[] B) {
		int minSwaps = 0;
		for(int i = 0; i < A.length; i++) {
			if(A[i] != target && B[i] != target)
				return Integer.MAX_VALUE;
			else if(A[i] != target)
				minSwaps += 1;
		}
		return minSwaps;
	}
}
