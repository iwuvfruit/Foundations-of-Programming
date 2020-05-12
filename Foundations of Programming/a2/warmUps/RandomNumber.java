package warmUps;
import java.util.Random;


public class RandomNumber {
	public static void main(String[] args) {
		
		int soln = (int)getRandomNumber(5, 2);
		System.out.println(soln);
		
	}
	
	
	
	public static double getRandomNumber(int max, int min) {
		//return a random dobule between 0 and 10
		Random random = new Random();
		double randomDouble = random.nextDouble();
//		start + (random * (end - start));
		double first = (0 + (randomDouble * (10 - 0)));
		
		int second = random.nextInt(10);
		
		int third = random.nextInt(max + 1 - min) + min;

		return third;
		
	}
}
