package warmUps;

public class ShiftString {
	public static void main(String[] args) {
		String result = shiftString("bananana", 2);
		System.out.println(result);
	}
	
	public static String shiftString(String s, int n) {
		if(n >= 0) {
			//formula: (i + shiftControl) % length 
			char[] newWord = new char[s.length()];
			for(int i = 0; i < s.length(); i++) {
				int index = (i + n) % s.length();
				newWord[index] = s.charAt(i);
			}
		    return String.valueOf(newWord);
		}
		if (n < 0) {
			//formula:  (i + length - n) % length
			char[] newWord = new char[s.length()];
			for(int i = 0; i < s.length(); i++) {
				int index = (i + s.length() - n) % s.length();
				newWord[index] = s.charAt(i);			}
			return String.valueOf(newWord);
		}
		else return "error";
	
		
//		String newWord = "";
//		for(int i = 0; i < s.length(); i++) {
//			int index = (s.charAt(i)+n) % (s.length());  we are adding char(unicode) + char(unicode) so it doesn't work
//			newWord += s.charAt(index);
//		}
	}
}
