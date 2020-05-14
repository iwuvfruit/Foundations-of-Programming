package warmUps;


public class TestingCat {
	public static void main(String[] args) {
		
		Cat mrK = new Cat("korean");
		Cat mrJ = new Cat("japanese");
		Cat mrC = new Cat("chinese");
		Cat mrV = new Cat("vietnamese");
		Cat mrP = new Cat("philipino"); 
		
		Cat[] cats = {mrK, mrJ, mrC, mrV, mrP};
		
		for(int i = 0; i < cats.length; i++) {
			cats[i].setMood("sleepy");
			cats[i].talk();

			}
	
		
		

	}
	
}
