package warmUps;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseString("Comp202 is awesome"));

	}
	public static String reverseString(String words) {
		String newWord = " ";
		int wordLength = words.length();
		for(int i=wordLength-1; i  >= 0; i--) {
			newWord += words.charAt(i);
		}
		return newWord;
	}
}
