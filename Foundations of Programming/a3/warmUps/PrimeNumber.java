package warmUps;

import java.lang.reflect.Array;

public class PrimeNumber {
	public static void main(String[] args) {
		int[] array = firstNPrimes(10);
		for( int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static int[] firstNPrimes(int n) {
		int[] inputArray = {};
		int index = 0;
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				if(i % j == 0) {
					break;
				}
				else {
					inputArray[index] = i;
					index ++;
				}
			}
		}
		return inputArray;
	}
}
