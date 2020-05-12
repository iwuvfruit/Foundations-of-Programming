package partTwo;

public class Calculator {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		int sum = a + b ;
		int product = a * b;
		int div1 = a / b;
		int div2 = a / c; 
		
		System.out.println("Sum of a and b: " + sum);
		System.out.println("Product of a and b: " + product);
		System.out.println("Dividing a by b: " + div1);
		System.out.println("Dividing a by c: " + div2);
		System.out.println("Is a larger than b: " + comparison(a, b));
		System.out.println("Is a odd: " + checkingOdd(a));
		
	}
	public static boolean comparison(int a , int b) {
		if(a > b) {
			return true;
		}
		return false;
	}
	
	public static boolean checkingOdd(int a) {
		if(a % 2 == 0) {
			return false;
		}
		return true;
	}
}
