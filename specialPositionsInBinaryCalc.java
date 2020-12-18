
public class specialPositionsInBinaryCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] matrix = {{0,0,0,1}, {1,0,0,0}, {0,1,1,0}};
			System.out.println(countSpecial(matrix));
	}
	
	public static int countSpecial(int[][] matrix) {
		int special = 0;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 1) {
					if(checkForRowAndColumn(i , j, matrix))
						special += 1;
				}
			}
		}
		return special;
	}
	
	public static boolean checkForRowAndColumn(int i, int j, int[][] matrix) {
		int rowRight = j + 1;
		int rowLeft = j - 1;
		int colUp = i - 1;
		int colDown = i + 1;
		while(rowRight < matrix[0].length) {
			if(matrix[i][rowRight] == 1)
				return false;
			rowRight += 1;
		}
		while(rowLeft >= 0) {
			if(matrix[i][rowLeft] == 1)
				return false;
			rowLeft -= 1;
		}
		while(colUp >= 0) {
			if(matrix[colUp][j] == 1)
				return false;
			colUp -= 1;
		}
		while(colDown < matrix.length) {
			if(matrix[colDown][j] == 1) 
				return false;
			colDown += 1;
		}
		return true;
	}

}
