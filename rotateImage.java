
public class rotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println(rotate(matrix));
	}
	
	public static int[][] rotate(int[][] matrix){
		if(matrix.length == 0)
			return new int[][] {};
			
		int[][] transpose = new int[matrix.length][matrix[0].length];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}
		
		for(int i = 0; i < transpose.length; i++) {
			int left = 0; 
			int right = transpose[i].length - 1;
			
			while(left <= right) {
				int temp = transpose[i][left];
				transpose[i][left] = transpose[i][right];
				transpose[i][right] = temp;
				left++;
				right--;
			}
		}
		
		return transpose;
	}

}
