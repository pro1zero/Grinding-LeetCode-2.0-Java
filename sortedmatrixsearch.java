
public class sortedmatrixsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,   3,  5,  7},{10, 11, 16, 20},{23, 30, 34, 50}};
		System.out.println(search(a, 500));
	}
	
	public static boolean search(int[][] a, int target) {
		 int left = 0;
	     int right = a[0].length - 1;
	        
	        while(left >= 0 && right <= a[0].length && left < a.length && right >=0){
	            if(a[left][right] == target){
	                return true;
	            }
	            else if(a[left][right] < target){
	                left++;
	            }
	            else{
	                right--;
	            }
	        }
	        return false;
	}

}
