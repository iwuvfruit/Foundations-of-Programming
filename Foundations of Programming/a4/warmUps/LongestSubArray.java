package warmUps;

public class LongestSubArray {
	public static void main(String[] args) {
		int[][] x = {{1,2,1}, {8, 6}};
		System.out.println(longestSubArray(x));
		
	}
	public static int longestSubArray(int[][] arr) {
		int maxLength = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length > maxLength) {
				maxLength = arr[i].length;
			}
		}
		return maxLength;
	}
}
