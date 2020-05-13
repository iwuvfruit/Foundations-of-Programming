package warmUps;

import java.util.Scanner;

public class Coordinates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
				
		coordinates(x, y);
//		coordinates(9, 9);
	}
	/**
	 * @param x
	 * @param y
	 */
	public static void coordinates(int x, int y) {
		System.out.println("^");
		for(int yAxis = y; yAxis > 0; yAxis--) {
				for(int xAxis = 0; xAxis < x+1; xAxis++) {
					if(xAxis == 0) {
						System.out.print("|");
					}
				
					else {
						System.out.print("(" + xAxis + "," +yAxis +")");

					}
					
				}
				System.out.println(" ");
			}
		System.out.print("+");
		for(int i = 0; i < y*y; i++) {
			System.out.print("-");
		}
		System.out.println(">");
		
		}
	}

