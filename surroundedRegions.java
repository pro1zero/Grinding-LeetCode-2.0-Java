
public class surroundedRegions {

	public static void main(String[] args) {
		char[][] grid = {{'O','X','X','O','X'}, {'X','O','O', 'X', 'O'},{'X','O','X', 'O', 'X'},{'O','X','O', 'O', 'O'},{'X','X','O', 'X', 'O'}};
		surround(grid);
	}
	
	public static void surround(char[][] grid) {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i < grid.length - 1; i++) {
			for(int j = 1; j < grid[i].length - 1; j++) {
				if(grid[i][j] == 'O') {
					checkAndModify(grid, i, j);
				}
			}
		}
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void checkAndModify(char[][] grid, int i, int j) {
		if(grid[i-1][j] == 'O' && i-1 == 0)
			return;
		if(grid[i+1][j] == 'O' && i+1 == grid.length - 1)
			return;
		if(grid[i][j-1] == 'O' && j-1 == 0)
			return;
		if(grid[i][j+1] == 'O' && j+1 == grid[0].length - 1)
			return;
		grid[i][j] = 'X';
		grid[i-1][j] = 'X';
		grid[i+1][j] = 'X';
		grid[i][j-1] = 'X';
		grid[i][j+1] = 'X';
	}

}