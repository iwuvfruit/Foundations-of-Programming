package warmUps;

public class Swap {
	public static void main(String[] args) {

//		swap(3,4);
		int x = 3;
		int y = 4;
		swap(x,y);
		System.out.println(x +" " + y);
		//they are not swapped because of the limited scope. 
		//the changes are limited to swap method thus when it's not called the swapped values dissapears 
	}
	public static void swap(int a, int b) {
		
		System.out.println("Inside swap: x is:" + a + " y is:" + b);
		int tmp;
		tmp = a;
		a = b;
		b = tmp;	
		System.out.println("Inside swap: x is:" + a + " y is:" + b);
	}

}
