package partTwo;

public class ExamGrading {
	public static void main(String[] args) {
	    char[][] responses = {{'C', 'A', 'B', 'B', 'C', 'A'},
                {'A', 'A', 'B', 'B', 'B', 'B'},
                {'C', 'B', 'A', 'B', 'C', 'A'},
                {'A', 'B', 'A', 'B', 'B', 'B'}};
	    char[] solutions = {'C', 'A', 'B', 'B', 'C', 'C'};
	    double[] result = gradeAllStudents(responses, solutions);
	    for(int i = 0; i < result.length; i++) {
	    	System.out.println(result[i]);
	    }
	    char[] a = {'A', 'B', 'C', 'D', 'C', 'A'}; 
	    char[] b = {'A', 'B', 'D', 'B', 'B', 'A'};
	    char[] soln = {'A', 'A', 'B', 'B', 'B', 'B'};
	    
	    int x =numWrongSimilar(a, b, soln);
	    System.out.println(x);

	    
}
	public static double[] gradeAllStudents(char[][] response, char[] soln) {
//		int count = 0;
		int len = soln.length;
//		int correct = 0;
		double[] result = new double[response.length];
		int index = 0;
		//I declare count and correct inside the loop, so it becomes zero before the every iteration 
		for(int i = 0; i < response.length; i++) {
			int count = 0;
			double correct = 0;
//			System.out.println(response[i].length);
			for(int j = 0; j < response[i].length; j++) {
				if (soln[j] == response[i][j]) {
					 correct= correct+1;
				}
				
				count ++;
			}
//			System.out.println(correct);
			result[index] = 100*(correct)/(response[i].length);
			index++;
			if(count != len) {
				throw new IllegalArgumentException("wrong exam");
			}
			
		}
		return result;
	}
	
	public static int numWrongSimilar(char[] a, char[] b, char soln[]) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != soln[i] && b[i] != soln[i]) {
				if(a[i] == b[i]) {
					count++;
				}
			}
		}
		return count;
		
		
		
	}
	//ToDo
	public static int[][] findSimilarAnswers(int minFlagged, char[][] responses, char[] soln) {
		return null;
	}
}

