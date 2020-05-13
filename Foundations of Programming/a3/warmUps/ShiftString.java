package warmUps;

public class ShiftString {
	public static void main(String[] args) {
		String result = shiftString("abcdef", 2);
		System.out.println(result);
	}
	public static String shiftString(String s, int n) {
		String newWord = "";
		for(int i = 0; i < s.length(); i++) {
			int index = (s.charAt(i + n)) % (s.length()); 
			newWord += s.charAt(index);
		}
		return newWord;
	}
}
