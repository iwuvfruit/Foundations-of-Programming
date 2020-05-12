package warmUps;
import java.util.*;


/**
 * @author iwuvf
 *
 */
public class Counting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int input = scanner.nextInt();
		
		System.out.println("enter a step");
		int step = scanner.nextInt();
		
		int i = 1;
		while(i <= input) {
			System.out.print(i + " ");
			i+=step;
		}
		
		
	}

}
