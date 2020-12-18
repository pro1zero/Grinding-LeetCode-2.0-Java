
public class sumOfRange {
	class NumArray{
		int[] prefixSum;
		int N;
		
		public NumArray(int[] nums) {
			N = nums.length;
			prefixSum = new int[N];
			int sum = 0;
			for(int i = 0; i < nums.length; i++) {
				sum += nums[i];
				prefixSum[i] = sum;
			}
		}
		
		public void update(int i, int value) {
			for(int left = i + 1; left < N; left++) {
				prefixSum[left] = prefixSum[left] - prefixSum[i] + value;
				if(i != 0) prefixSum[left] += prefixSum[i - 1]; 
			}
		}
		
		public int sumRange(int i, int j) {
			if(i == 0) return prefixSum[j];
			return prefixSum[j] - prefixSum[i-1];
		}
	}
	public static void main(String[] args) {
		
	}

}
