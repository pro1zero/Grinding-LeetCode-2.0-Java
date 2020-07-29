import java.util.*;

public class setZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};
		setZero(matrix);
	}
	
	public static void setZero(int[][] matrix) {
		List<List<Integer>> indices = new ArrayList<>();
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 0) {
					List<Integer> index = List.of(i, j);
					indices.add(index);
				}
			}
		}
		
		for(List<Integer> list: indices) {
			int row = list.get(0);
			int col =list.get(1);
			
			while(row < matrix.length) {
				matrix[row++][col] = 0;
			}
			row = list.get(0);
			while(row >= 0) {
				matrix[row--][col] = 0;
			}
			row = list.get(0);
			while(col < matrix[0].length) {
				matrix[row][col++] = 0;
			}
			col =list.get(1);
			while(col >= 0) {
				matrix[row][col--] = 0;
			}
		}
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
