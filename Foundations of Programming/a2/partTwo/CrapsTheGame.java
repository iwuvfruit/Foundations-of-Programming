package partTwo;
import java.util.*;


public class CrapsTheGame {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how much you want to put");
		double warChest = scanner.nextDouble();
		System.out.println("Enter how much you want to bet");
		double betMoney = scanner.nextDouble();
		
		passLineBet(warChest, betMoney);
		
	}
	public static int diceRoll() {
//		[1,numSides] 
//		r.nextInt(numSides)+1;

		Random random = new Random();
		int dice1 = random.nextInt(6)+1;
		int dice2 = random.nextInt(6)+1;
		int sum = dice1 + dice2;
//		for(int i = 0; i <= 30; i++) {
//			Random random = new Random();
//			int dice1 = random.nextInt(6)+1;
//			System.out.println(dice1);
//		}
		return sum;
		
	}
	public static int secondStage(int point) {
		while(true) {
			int value = diceRoll();
			if(value ==7 || value == point){
				return value;
				
			}
			System.out.print(value + " ");
		}
		
		
//		int x = 0;
//		while((diceRoll() != 7) || (diceRoll() != point)) {
//			System.out.print(diceRoll() + " ");
//			x= diceRoll();
//		}
//		return x; 
//this is wrong because diceRoll() prints different value every time so I need to set x = diceRoll() and use that
		//also should be && because if || then it won't check point 
	}
	public static boolean canPlay(double warChest, double betMoney) {
		if(warChest == 0) {
			return false;
		}
		if(warChest < betMoney) {
			return false;
		}
		return true;
	}
	
	public static double passLineBet(double warChest, double betMoney) {
		if(!(canPlay(warChest, betMoney))) {
			System.out.println("Insufficient Fund. you cannot play" );

			System.out.println("You now have: $" + warChest);
			return warChest;
		}
		int value = diceRoll(); 
		if(value == 7 || value == 11) {
			System.out.println("A " + value + " has been rolled. You Win!");
			warChest += betMoney; 
			return warChest;
		}
		else if(value == 2 || value == 3 || value == 12) {
			System.out.println("A " + value + " has been rolled. You lose!");
			warChest -= betMoney;
			return warChest; 
		}
		else {
			System.out.println("A " + value + " has been rolled again.");
			secondStage(value);
			int secondValue = secondStage(value);
			if (secondValue == 7) {
				System.out.println("A " + secondValue + " has been rolled. You lose!");
				warChest -= betMoney;
				return warChest;
			}
			else if(secondValue == value) {
				System.out.println("A " + secondValue + " has been rolled. You win!");
				warChest += betMoney; 
				return warChest;
			}
			else {
				return 0.0;
			}
		}
		
	}
	
}
