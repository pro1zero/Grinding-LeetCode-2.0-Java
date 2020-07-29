import java.util.*;
public class mergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		System.out.println(mergeIntervals(intervals));
	}
	
	public static int[][] mergeIntervals(int[][] intervals){
		if(intervals.length < 2)
			return intervals;
		
		Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
		
		List<int[]> output = new ArrayList<>();
		int[] current = intervals[0];
		output.add(current);
		
		for(int[] interval: intervals) {
			int currentStart = current[0];
			int currentEnd = current[1];
			
			int nextStart = interval[0];
			int nextEnd = interval[1];
			
			if(currentEnd >= nextStart) {
				current[1] = Math.max(currentEnd, nextEnd);
			}else {
				current = interval;
				output.add(current);
			}
		}
		return output.toArray(new int[output.size()] []);
	}

}