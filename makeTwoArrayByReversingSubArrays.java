import java.util.*;
public class makeTwoArrayByReversingSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] target = {1,2,3,4};
		int[] array = {2,4,1,3};
		System.out.println(same(target, array));
	}
	
	public static boolean isSame(int[] target, int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> map1 = new HashMap<>();
		for(int i = 0; i < target.length; i++) {
			map.put(target[i], map.getOrDefault(target[i], 0) + 1);
		}
		for(int i = 0; i < array.length; i++) {
			map1.put(array[i], map1.getOrDefault(array[i], 0) + 1);
		}
		return map.equals(map1);
	}
	
	public static boolean same(int[] target, int[] array) {
		int[] count = new int[1001];
		for(int i = 0; i < target.length; i++) {
			count[target[i]]++;
			count[array[i]]--;
		}
		for(int i = 0; i < count.length; i++) {
			if(count[i] != 0)
				return false;
		}
		return true;
	}

}
