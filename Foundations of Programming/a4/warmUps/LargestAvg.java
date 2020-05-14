package warmUps;

public class LargestAvg {
	public static void main(String[] args) {
		double[][] x = {{1.5,2.3,2.2}, {12.5, 22.2, 1.2}};
		double[] y = largestAverage(x);
		for(int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}
		
	}
	
	public static double[] largestAverage(double[][] x) {
		double maxAvg = 0; 
		double tmp = 0;
		double avg = 0;
//		double[] array = new double[100];
		int a=0; 
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				tmp += x[i][j];
			}
			avg = tmp / x[i].length;
			if(avg > maxAvg) {
				maxAvg = avg;
				a  = i;
//				System.out.println(avg);
//				System.out.println(a);
			}
			
		}
//		System.out.println(a);
		int len = x[a].length;
		double[] result = new double[len];
		
		for(int z = 0; z < x[a].length; z++) {
			result[z] = x[a][z];
		}
		
		return result;

	}
}
