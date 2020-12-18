import java.util.*;
public class queensThatCanAttackTheKing {

	public static void main(String[] args) {
		int[][] queens = {{5,6},{7,7},{2,1},{0,7},{1,6},{5,1},{3,7},{0,3},{4,0},{1,2},{6,3},{5,0},{0,4},{2,2},{1,1},{6,4},{5,4},{0,0},{2,6},{4,5},{5,2},{1,4},{7,5},{2,3},{0,5},{4,2},{1,0},{2,7},{0,1},{4,6},{6,1},{0,6},{4,3},{1,7}};
		int[] king = {3,4};
		System.out.println(findAll(queens, king));
	}	
	
	public static List<List<Integer>> findAll(int[][] queens, int[] king){
		List<String> queen = new ArrayList<>();
		for(int[] a: queens) {
			String s = a[0] + "" + a[1];
			queen.add(s);
		}
		List<List<Integer>> result = new ArrayList<>();
		int i = king[0], j = king[1];
		expandTop(i , j, king, queens, queen, result);
		expandBottom(i , j, king, queens, queen, result);
		expandLeft(i , j, king, queens, queen, result);
		expandRight(i , j, king, queens, queen, result);
		expandTopLeft(i , j, king, queens, queen, result);
		expandTopRight(i , j, king, queens, queen, result);
		expandBottomLeft(i , j, king, queens, queen, result);
		expandBottomRight(i , j, king, queens, queen, result);
		return result;
	}

	
	public static void expandTop(int i, int j, int[] king, int[][] queens, List<String> queen, List<List<Integer>> result)
	{
		while(i - 1 >= 0) {
			String s = (i-1) + "" + j;
			if(queen.contains(s)){
				List<Integer> temp = new ArrayList<>();
				temp.add(i-1);
				temp.add(j);
				result.add(temp);
				return;
			}
			i -= 1;
		}
	}
	
	public static void expandLeft(int i, int j, int[] king, int[][] queens, List<String> queen, List<List<Integer>> result)
	{
		while(j - 1 >= 0) {
			String s = i + "" + (j-1);
			if(queen.contains(s)){
				List<Integer> temp = new ArrayList<>();
				temp.add(i);
				temp.add(j-1);
				result.add(temp);
				return;
			}
			j -= 1;
		}
	}
	
	public static void expandRight(int i, int j, int[] king, int[][] queens, List<String> queen, List<List<Integer>> result)
	{
		while(j + 1 < 8) {
			String s = i + "" + (j+1);
			if(queen.contains(s)){
				List<Integer> temp = new ArrayList<>();
				temp.add(i);
				temp.add(j+1);
				result.add(temp);
				return;
			}
			j += 1;
		}
	}
	
	public static void expandBottom(int i, int j, int[] king, int[][] queens, List<String> queen, List<List<Integer>> result)
	{
		while(i + 1 < 8) {
			String s = (i+1) + "" + j;
			if(queen.contains(s)){
				List<Integer> temp = new ArrayList<>();
				temp.add(i+1);
				temp.add(j);
				result.add(temp);
				return;
			}
			i += 1;
		}
	}
	
	public static void expandTopLeft(int i, int j, int[] king, int[][] queens, List<String> queen, List<List<Integer>> result)
	{
		while(i-1 >= 0 && j-1 >= 0) {
			String s = (i-1) + "" + (j-1);
			if(queen.contains(s)){
				List<Integer> temp = new ArrayList<>();
				temp.add(i-1);
				temp.add(j-1);
				result.add(temp);
				return;
			}
			j -= 1;
			i -= 1;
		}
	}
	
	public static void expandTopRight(int i, int j, int[] king, int[][] queens, List<String> queen, List<List<Integer>> result)
	{
		while(i-1 >= 0 && j+1 < 8) {
			String s = (i-1) + "" + (j+1);
			if(queen.contains(s)){
				List<Integer> temp = new ArrayList<>();
				temp.add(i-1);
				temp.add(j+1);
				result.add(temp);
				return;
			}
			j += 1;
			i -= 1;
		}
	}

	public static void expandBottomLeft(int i, int j, int[] king, int[][] queens, List<String> queen, List<List<Integer>> result)
	{
		while(i+1 < 8 && j-1 >= 0) {
			String s = (i+1) + "" + (j-1);
			if(queen.contains(s)){
				List<Integer> temp = new ArrayList<>();
				temp.add(i+1);
				temp.add(j-1);
				result.add(temp);
				return;
			}
			j -= 1;
			i += 1;
		}
	}
	
	public static void expandBottomRight(int i, int j, int[] king, int[][] queens, List<String> queen, List<List<Integer>> result)
	{
		while(i+1 < 8 && j+1 < 8) {
			String s = (i+1) + "" + (j+1);
			if(queen.contains(s)){
				List<Integer> temp = new ArrayList<>();
				temp.add(i+1);
				temp.add(j+1);
				result.add(temp);
				return;
			}
			j += 1;
			i += 1;
		}
	}

}
