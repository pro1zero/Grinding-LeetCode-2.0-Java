import java.util.*;
public class repeatedMatrixValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> matrix = new ArrayList<>();
		List<Integer> nums = List.of(1,3,7,4,5);
		matrix.add(nums);
		nums = new ArrayList<>();
		nums = List.of(2,5,9,3,3);
		matrix.add(nums);
		nums = new ArrayList<>();
		nums = List.of(1,8,5,3,5);
		matrix.add(nums);
		nums = new ArrayList<>();
		nums = List.of(5,0,3,5,6);
		matrix.add(nums);
		nums = new ArrayList<>();
		nums = List.of(3,8,3,5,6);
		matrix.add(nums);
		nums = new ArrayList<>();
		nums = List.of(1,0,3,0,5);
		matrix.add(nums);
		System.out.println(repeated(matrix));
	}
	
	public static List<Integer> repeated(List<List<Integer>> matrix){
		List<Integer> repeated = new ArrayList<>();
		for(int i = 0; i < matrix.size(); i++) {
			for(int j = 0; j < matrix.get(i).size(); j++) {
				if(!repeated.contains(matrix.get(i).get(j))) {
					boolean flag = traverseArray(matrix.get(i).get(j), matrix);
					if(flag) repeated.add(matrix.get(i).get(j));
				}
			}
		}
		return repeated;
	}
	
	public static boolean traverseArray(int key, List<List<Integer>> matrix) {
		
		for(int i = 0; i < matrix.size(); i++) {
			boolean flag = false;
			for(int j = 0; j < matrix.get(i).size(); j++) {
				if(key == matrix.get(i).get(j)) {
					flag = true;
				}
			}
			if(!flag) {
				return false;
			}
		}
		
		for(int i = 0; i < matrix.get(0).size(); i++) {
			boolean flag = false;
			for(int j = 0; j < matrix.size(); j++) {
				if(key == matrix.get(j).get(i)) {
					flag = true;
				}
			}
			if(!flag) {
				return false;
			}
		}
		return true;
	}

}
