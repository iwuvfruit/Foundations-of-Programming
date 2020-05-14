package partTwo;


public class Cipher {
	public static void main(String[] args) {
//		System.out.println(charRightShift('#', 2));
//		System.out.println(charRightShift('g', 2));
//		System.out.println(charRightShift('h', 32));

//		System.out.println(charLeftShift('i', 2));
//		System.out.println(charLeftShift('#', 2));
//		System.out.println(charLeftShift('h', 32));
		
//		System.out.println(caserEncode("cats and dogs", 5));
//		System.out.println(caserDecoder("hfyx fsi itlx", 5));
//		
//		int[] result = obtainKeys("hello");
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
		
		System.out.println(vigenereEncode("elephants and hippos", "rats"));	
		}

	public static char charRightShift(char a, int n) {
		if (n < 0 || n > 25) {
			System.out.println("input should be in the range");
			return 48;
		}
		// 97 = a, 122=z
		if (a >= 97 && a <= 122) {
			a += n;
			return a;
		} else {
			return a;
		}
	}

	public static char charLeftShift(char a, int n) {
		if (n < 0 || n > 25) {
			System.out.println("input should be in the range");
			return 48;
		}
		// 97 = a, 122=z
		if (a >= 97 && a <= 122) {
			a -= n;
			return a;
		} else {
			return a;
		}
	}

	public static String caserEncode(String message, int key) {
		String newWord = " ";
		if (key < 0 || key > 25) {
			System.out.println("key should be in the range");
			return " ";
		}
		else {
			for(int i = 0; i < message.length(); i++) {
				if(message.charAt(i) == ' ') {
					newWord += ' ';
				}
				else {
					char a = (char) (message.charAt(i) + key);
					newWord += a;
				}
			
			}
			return newWord;
		}
	}
	
	public static String caserDecoder(String message, int key) {
		String newWord = " ";
		if (key < 0 || key > 25) {
			System.out.println("key should be in the range");
			return " ";
		}
		else {
			for(int i = 0; i < message.length(); i++) {
				if(message.charAt(i) == ' ') {
					newWord += ' ';
				}
				else {
					char a = (char) (message.charAt(i) - key);
					newWord += a;
				}
			
			}
			return newWord;
		}
	}
	public static int[] obtainKeys(String input) {
		//97 = a , 122 = z 
		int[] result = new int[input.length()];
		int index = 0;
		int value;
		for(int i = 0; i < input.length(); i++) {
			value = (int)input.charAt(i) - 97;
//			System.out.println(value);
			result[index] = value;
			index++;
		}
		return result;
	}
	
	public static String vigenereEncode(String message, String keyword) {
		char x; 
		String newWord = " ";
		int[] key = obtainKeys(keyword);
		for(int i = 0; i < key.length; i++) {
			if(key[i] < 0 || key[i] > 25) {
				System.out.println("key should be lower case alphabet");
				return " ";
			}
		}
		int index = 0;
		for(int i = 0; i < message.length(); i++) {
			x = charRightShift(message.charAt(i), key[index % key.length]);
			index++;
			newWord += x;
			
		}
		return newWord;
		
	}


}
