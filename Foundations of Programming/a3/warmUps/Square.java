package warmUps;

public class Square {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 0 || i == 9) {
				for(int j = 0; j < 10; j++) {
					System.out.print("*");
			}
			}
			else {
				for(int j = 0; j < 10; j++) {
					if(j == 0 || j==9) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			
			System.out.println(" ");
			}
		
	}


}
