import java.util.*;
public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList<>();
		list.add(new ArrayList<>(List.of(2)));
		list.add(new ArrayList<>(List.of(3,4)));
		list.add(new ArrayList<>(List.of(6,5,7)));
		list.add(new ArrayList<>(List.of(4,1,8,3)));
		System.out.println(triangles(list));
	}
	
	public static int triangles(List<List<Integer>> list) {
		List<Integer> dp = new ArrayList<>(list.get(list.size() - 1));
		for(int i = list.size() - 2; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				dp.set(j, Math.min(dp.get(j), dp.get(j + 1)) + list.get(i).get(j));
			}
		}
		return dp.get(0);
	}

}
