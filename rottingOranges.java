
public class rottingOranges {

	public static void main(String[] args) {
		int[][] grid = {{2,1,1}, {0,1,1},{1,0,1}};
		System.out.println(rottenOranges(grid));
	}
	//doesn't works
	public static int rottenOranges(int[][] grid) {
		int minutes = 0;
		boolean flag = false;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 2) {
					if(i-1 >= 0 && grid[i-1][j] == 1) {
						grid[i-1][j] = 2;
						flag = true;
					}
					if(i+1 < grid.length && grid[i+1][j] == 1) {
						grid[i+1][j] = 2;
						flag = true;
					}
					if(j-1 >= 0 && grid[i][j-1] == 1) {
						grid[i][j-1] = 2;
						flag = true;
					}
					if(j+1 < grid[0].length && grid[i][j+1] == 1) {
						grid[i][j+1] = 2;
						flag = true;
					}
				}
				if(flag) {
					minutes += 1;
					flag = false;
				}
			}
		}
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 1) {
					return -1;
				}
			}
		}
		return minutes;
	}

}
