package partTwo;

import java.util.Random;

public class Sheep {
	private String name;
	private int age;
	private boolean hasWool;
	private static Random numberGenerator = new Random(123);
	
	public Sheep(String name, int age) {
		this.name = name;
		this.age = age;
		this.hasWool = true;
		
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double shear() {
		if(this.hasWool) {
			double randNumb = numberGenerator.nextDouble();
//			start + (random * (end - start)); //might need to add 1 if inclusive?
			double wool = 6 + (randNumb * (10 - 6));
			return wool;
		}
		else {
			return 0.0;
		}
	}
	
 
	
}
