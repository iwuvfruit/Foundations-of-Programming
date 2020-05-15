package partTwo;

public class Dog {
	private String name;
	private String breed; 
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	public String getName(){
			return this.name;
	}
	public int herd() {
		if (this.breed.toLowerCase().contains("collie")) {
			return 20;
		}
		else if(this.breed.toLowerCase().contains("shepherd")) {
			return 25;
		}
		else if(this.breed.toLowerCase().contains("kelpies") || this.breed.toLowerCase().contains("teruvens")) {
			return 30;
		}
		else {
			return 10;
		}
		
	}
	
	}
	

