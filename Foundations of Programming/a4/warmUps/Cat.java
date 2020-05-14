package warmUps;

public class Cat {
	private String name;
	private String breed;
	private int age;
	private String mood;
	
	public Cat(String breed) {
		this.breed = breed;
	}
	
	public void talk() {
		if(this.mood == "sleepy") {
			System.out.println("meow");
		}
		else if(this.mood == "hungry") 
		{
			System.out.println("rawr");
		}
		else if(this.mood == "angry") {
			System.out.println("hssss");
		}
		else if(this.mood == "happy") {
			System.out.println("purrrr");
		}
		
		else if(this.mood == "crazy") {
			System.out.println("afjsdkljldsaj");
		}

	}
	public String getName() {
		return this.name;
	}


	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}
	
}
