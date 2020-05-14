package warmUps;

public class ScalarMultiply {
	public static void main(String[] args) {
		double[] x = {1.2, 2.3, 4.2};
		scalarMultiply(x, 2.0);
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
	}
	public static void scalarMultiply(double[] x, double scale) {
		for(int i = 0; i < x.length; i++) {
			x[i] *= scale;
		}
	
	}
	

}
//must be static. it's used in scalarmultipy class. 
