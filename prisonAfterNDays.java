import java.util.Arrays;

public class prisonAfterNDays {
	public static void main(String[] args) {
		System.out.println(prisonCells(new int[] {0,1,0,1,1,0,0,1}, 7));
	}
	
	public static String prisonCells(int[] cells, int n) {
		
		int reps = ((n-1) % 14) + 1;
		
		for(int i = reps; i > 0; i--) {
			int[] cells2 = new int[8];
			for(int j = 1; j < 7; j++) {
				cells2[j] = (cells[j-1] == cells[j+1])?1:0;
			}
			cells = cells2;
		}
		return Arrays.toString(cells);
	}
}
