
public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("naive " + createTable(10, 22));
		System.out.println("optimal " + createTableOptimal(10, 22));
	}
	
	public static int createTable(int n, int x) {
		if(n == 0)
			return 0;
		
		int[][] table = new int[n][n];
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				table[i][j] = (i + 1)*(j + 1);
				if(table[i][j] == x)
					count++;
			}
		}
		return count;
	}
	
	public static int createTableOptimal(int n, int x) {
		if(n == 0)
			return 0;
		
		
		int row = 0;
		int column = 0;
		int count = 0;
		
		while(row*column < n*n) {
			if(row >= n) {
				row = 0;
				column++;
				continue;
			}
			
			int source = (row + 1)*(column + 1);
			if(source == x)
				count++;
			
			row += 1;
		}
		
		return count;
	}

}
