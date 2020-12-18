
public class maximizeDistanceToClosestPerson {

	public static void main(String[] args) {
		int[] seats = {1,0,0,0,1,0,1};
		System.out.println(closestMax(seats));
	}
	
	public static int closestMax(int[] seats) {
		int longestStreak = 0;
		int currentStreak = 0;
		int maxDistance = 0;
		for(int i = 0; i < seats.length; i++) {
			if(seats[i] == 0) {
				currentStreak += 1;
				longestStreak = Math.max(longestStreak, currentStreak);
				maxDistance = Math.max(maxDistance, (longestStreak + 1)/2);
			}
			else {
				currentStreak = 0;
			}
		}
		for(int i = 0; i < seats.length; i++) {
			if(seats[i] == 1) {
				maxDistance = Math.max(maxDistance, i);
				break;
			}
		}
		for(int i = seats.length - 1; i >= 0; i--) {
			if(seats[i] == 1) {
				maxDistance = Math.max(maxDistance, seats.length - i - 1);
				break;
			}
		}
		return maxDistance;
		
	}

}
