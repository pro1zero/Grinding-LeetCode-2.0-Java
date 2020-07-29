import java.util.*;
public class trappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {0,8,0,0,5,0,0,10,0,0,1,1,0,3};
		System.out.println(trapRainWater(height));
	}
	
	public static int trapRainWater(int[] height) {
		if(height.length <= 2)
			return 0;
		
		int volume = 0;
		
		int[] leftHighest = new int[height.length + 1];
		leftHighest[0] = 0;
		
		for(int i = 0; i<height.length;i++) {
			leftHighest[i+1] = Math.max(leftHighest[i], height[i]);
		}
		System.out.println(Arrays.toString(leftHighest));
		int rightHighest = 0;
		
		for(int i = height.length - 1;i >= 0; i--) {
			rightHighest = Math.max(height[i], rightHighest);
			if(Math.min(leftHighest[i+1], rightHighest) > height[i]) {
				volume += Math.min(leftHighest[i+1], rightHighest) - height[i];
			}
		}
		return volume;
	}
}
