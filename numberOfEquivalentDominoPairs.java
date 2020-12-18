
public class numberOfEquivalentDominoPairs {

	public static void main(String[] args) {
		int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
		System.out.println(optimal(dominoes));
	}
	//time limit exceeded (TLE)
	public static int getPairs(int[][] dominoes) {
		int pairs = 0;
		int count = 0;
		for(int[] domino: dominoes) {
			count++;
			int p = domino[0];
			int q = domino[1];
			for(int i = count; i < dominoes.length; i++) {
				if((p == dominoes[i][0] && q == dominoes[i][1]) || (q == dominoes[i][0] && p == dominoes[i][1]))
					pairs += 1;
			}
		}
		return pairs;
	}
	
	public static int optimal(int[][] dominoes) {
		int[] map = new int[100];
		int pairs = 0;
		for(int[] domino: dominoes) {
			int p = domino[0];
			int q = domino[1];
			int hash = Math.max(p, q)*10 + Math.min(p, q);
			pairs += map[hash]++;
		}
		return pairs;
	}

}
