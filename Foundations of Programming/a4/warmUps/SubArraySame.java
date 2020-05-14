package warmUps;

public class SubArraySame {
	public static void main(String[] args) {
		int[][] x = {{1,6,1}, {6,6}};
		
		System.out.println(subSameArray(x));
		
 		
	}
	public static boolean subSameArray(int[][] a) {
		int value; 
		for(int i = 0; i < a.length; i++) {
			value = a[i][0];
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] != value) {
					return false;
				}
			}
		}
		return true;
	}
}