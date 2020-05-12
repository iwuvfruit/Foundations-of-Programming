package partTwo;

public class GradingProgram {
	public static void main(String[] args) {
		double assignment = Double.parseDouble(args[0]);
		double midterm = Double.parseDouble(args[1]);
		double finalExam = Double.parseDouble(args[2]);
		
//		double a = finalGrade(28.0, 18.0, 30.0);
//		double b= finalGrade(28.0, 16.0, 38.0);
//		
//		System.out.println(a + "and" +  b);
		
		System.out.println("your final grade is " + finalGrade(assignment, midterm, finalExam));
	}
	
	public static double divide(double a, double b) {
		if(b==0.0) {
			System.out.println("the input shouldn't be zero");
		}
		return a / b; 
	}
	public static double getMax(double a, double b) {
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static double finalGrade(double assignment, double midterm, double finalExam) {
		double assignmentWorth = 35.0;
		double midtermWorth = 20.0;
		double finalExamWorth = 45.0;
		
		double midWorth = divide(midterm, midtermWorth);
		double finalWorth = divide(finalExam, finalExamWorth);
		
		double schemeChoser = getMax(midWorth, finalWorth);
		
		double grade = 0.0;
		if(schemeChoser == midWorth) {
			grade = (assignment + midterm + finalExam)/100;
			return grade * 100;
		}
		else if(schemeChoser == finalWorth) {
			grade = (assignment + finalExam)/80;
			return grade * 100;
		}
		else {
			return 0.0;
		}
	}

}
