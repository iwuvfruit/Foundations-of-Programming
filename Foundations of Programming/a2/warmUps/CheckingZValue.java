package warmUps;

public class CheckingZValue {
	public static void main(String[] args) {
		System.out.println(checkZVal(1, 2, 3));
		
	}
	public static boolean checkZVal(int x, int y, int z) {
		if (z == 3 || z == (x+y)) {
			return true;
		}
		return false;
	}

}
