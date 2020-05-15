package partTwo;

public class Farm {
	private Sheep[] sheeps;
	private Dog dog;
	private String name;
	
	public Farm(String name, Dog dog, Sheep[] sheep) {
		this.name = name;
		this.dog = dog;
		this.sheeps = new Sheep[sheep.length];
		for(int i = 0; i<sheep.length; i++) {
			sheeps[i] = sheep[i];
		}
		if (this.sheeps.length > this.dog.herd()) {
			throw new IllegalArgumentException("the dog can't control the sheeps");
		}
		
		
	}
	public String getName() {
		return this.name;
	}
	public int getNumSheep(){
		return this.sheeps.length+1;
	}
	public void printFarm() {
		String name = this.name;
		String nameOfDogOnTheFarm = this.dog.getName();
		System.out.println("the name of the farm is " + name + "the name of the dog on the farm is " + 
				nameOfDogOnTheFarm + " the names and the ages of the sheeps are ");
		for(int i = 0; i < this.sheeps.length; i++) {
			System.out.print(" " + sheeps[i].getName() + " "+ sheeps[i].getAge()+ " ");
		}
		System.out.println();
	}
	public double getWool() {
		double wool = 0;
		for(int i = 0; i < this.sheeps.length; i++) {
			wool += this.sheeps[i].shear();
		}
		return wool;
	}

}
