
public class predictTheWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,5,233,7};
		System.out.println(predictWinner(nums));
	}
	
	public static boolean predictWinner(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		
		int p1 = 0;
		int p2 = 0;
		boolean flag = true;
		while(left <= right) {
			if(flag) {
				flag =! flag;
				int front = nums[left];
				int end = nums[right];
				if(front >= end) {
					p1 += front;
					left++;
					continue;
				}
				else {
					p1 += end;
					right--;
					continue;
				}
			}else {
				flag =! flag;
				int front = nums[left];
				int end = nums[right];
				if(front >= end) {
					p2 += front;
					left++;
					continue;
				}
				else {
					p2 += end;
					right--;
					continue;
				}
			}
		}
		System.out.println(p1 + " " + p2);
		return p1 >= p2?true: false;
	}

}
