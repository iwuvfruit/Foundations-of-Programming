package partTwo;

public class Circle {
	public static void main(String[] args) {
		drawCircle(3,3,3,'&');

	}

	public static boolean onCircle(int radius, int a, int b, int x, int y ) {
	 if( Math.pow(radius, 2) <= (Math.pow((x-a), 2) + Math.pow((y-b), 2)) &&
			 (Math.pow((x-a), 2) + Math.pow((y-b), 2)) <= (Math.pow(radius, 2) + 1)) {
		 return true;
	 }
	 else {
		 return false;
	 }
			 }
	

	public static void verifyInput(int radius, int a, int b) {
		if(radius < 0) {
			throw new IllegalArgumentException("the radius must be positive"); 
		}
		//the circle must fit upper right, the radius needs to be smaller than the center 
		if(radius > a || radius >b) {
			throw new IllegalArgumentException("the radius needs to be smaller");
		}
	}
	public static void drawCircle(int radius, int x, int y, char symbol) {
		System.out.println("^");
		for(int i = 9; i >=0; i--) {	
			for(int j = 0; j <= 9; j++) {
//				if(i==(9-(radius+y)) & j==(x-radius) || i==(9-(radius+y)) & j==(x+radius))  {
//					System.out.print("x");
//				}
				if(onCircle(radius, x, y, i, j)) {
					System.out.print(symbol);
				}
				else if(i==0 && j == 0) {
					System.out.print("+");
				}
				else if(i==0 && j == 9) {
					System.out.print(">");
				}
				else if(j==0) {
					System.out.print("|");
				}
				else if(i==0) {
					System.out.print("-");

				}
				
				else{
		            System.out.print(" ");
		          }
			}
			System.out.println(" ");
		}
	
		
	}
}
