
public class uniquePaths3 {
	public static void main(String[] args) {
		int[][] grid = {{1,0,0,0}, {0,0,0,0}, {0,0,0,2}};
		System.out.println(calc(grid));
	}
	
	public static int calc(int[][] grid) {
		int sx = 0, sy = 0, empty = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 0) empty += 1;
				else if(grid[i][j] == 1) {
					sx = i;
					sy = j;
				}
			}
		}
		return dfs(grid, sx, sy, empty, new boolean[grid.length][grid[0].length]);
	}
	
	public static int dfs(int[][] grid, int x, int y, int empty, boolean[][] visited) {
		if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] < 0 || visited[x][y]) {
			return 0;
		}
		if(grid[x][y] == 2) {
			if(empty == 0) return 1;
		}
		int result = 0;
		visited[x][y] = true;
		if(grid[x][y] == 0) empty -= 1;
		result += dfs(grid, x+1, y, empty, visited);
		result += dfs(grid, x-1, y, empty, visited);
		result += dfs(grid, x, y+1, empty, visited);
		result += dfs(grid, x, y-1, empty, visited);
		visited[x][y] = false;
		if(grid[x][y] == 0)
			empty += 1;
		return result;
	}

}
