import java.util.*;
public class riverSizes {

	public static void main(String[] args) {
		int[][] matrix = {{1, 0, 0, 1, 0},{1, 0, 1, 0, 0},{0, 0, 1, 0, 1},{1, 0, 1, 0, 1},{1, 0, 1, 1, 0}};
		System.out.println(riverSizess(matrix));
	}
	
	public static List<Integer> riverSizess(int[][] matrix){
		List<Integer> sizes = new ArrayList<>();
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(visited[i][j]) {
					continue;
				}
				traverseNode(i, j, matrix, visited, sizes);
			}
		}
		Collections.sort(sizes);
		return sizes;
	}
	
	public static void traverseNode(int i, int j, int[][] matrix, boolean[][] visited, List<Integer> sizes) {
		int currentSize = 0;
		Stack<Integer[]> stack = new Stack<>();
		stack.add(new Integer[] {i, j});
		while(!stack.isEmpty()) {
			Integer[] currentNode = stack.pop();
			i = currentNode[0];
			j = currentNode[1];
			if(visited[i][j])
				continue;
			visited[i][j] = true;
			if(matrix[i][j] == 0)
				continue;
			currentSize += 1;
			List<Integer[]> unvisited = getNeighbours(i, j, matrix, visited);
			for(Integer[] neighbour: unvisited) {
				stack.add(neighbour);
			}
		}
		if(currentSize > 0) {
			sizes.add(currentSize);
		}
	}
	
	public static List<Integer[]> getNeighbours(int i, int j, int[][] matrix, boolean[][] visited){
		List<Integer[]> unvisited = new ArrayList<>();
		if(i > 0 && !visited[i-1][j]) {
			unvisited.add(new Integer[] {i-1, j});
		}
		if(i < matrix.length - 1 && !visited[i+1][j]) {
			unvisited.add(new Integer[] {i+1, j});
		}
		if(j > 0 && !visited[i][j-1]) {
			unvisited.add(new Integer[] {i, j-1});
		}
		if(j < matrix.length - 1 && !visited[i][j+1]) {
			unvisited.add(new Integer[] {i, j+1});
		}
		return unvisited;
	}

}
