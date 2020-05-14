package warmUps;

public class DeleteElement {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4};
		int[] ab = deleteElement(x, 3);
		for(int i = 0; i < ab.length; i++) {
			System.out.println(x[i]);
		}
		
	}
	public static int[] deleteElement(int[] x, int target) {
		int count = 0;
		int index = 0;
		for(int i=0; i < x.length; i++) {
			if(x[i] == target) {
				continue;
			}
			count ++;	
		}
		int[] newArray = new int[count];
		for(int i=0; i < x.length; i++) {
			if(x[i] != target) {
				newArray[index] = x[i];
				index ++;
			}
		}
		return newArray;
	}
	
	
	public static String[] deleteString(String[] x, String target) {
		int count = 0;
		int index = 0;
		for(int i = 0; i < x.length; i++) {
			if(x[i] == target) {
				continue;
			}
			count ++;
		}
		String[] newArray = new String[count];
		for(int i = 0; i < x.length; i++) {
			if(x[i] != target) {
				newArray[index] = x[i];
				index ++;
			}
			
		}

		return newArray;
	}
}
