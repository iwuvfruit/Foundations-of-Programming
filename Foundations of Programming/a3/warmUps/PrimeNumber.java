package warmUps;


public class PrimeNumber {
	public static void main(String[] args) {
		int[] array = firstNPrimes(10);
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		
	}
	public static int[] firstNPrimes(int n) {
		int[] firstPrimes = new int[n];
		int index = 0;
		for(int i = 2; i < n; i++) {
			if (isPrime(i)) {
				firstPrimes[index] = i;
				index++;
			}
		}
		return firstPrimes;
	}
	public static boolean isPrime(int a) {
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
