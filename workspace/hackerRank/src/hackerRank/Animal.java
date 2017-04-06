package hackerRank;

public abstract class Animal {
	private int age;
	
	public Animal(int age){
		this.age = age;
		System.out.println("An animal has been created.");
	}

	public abstract void eat();
	
	public int getAge(){
		return age;
	}
	
	public void sleep(){
		System.out.println("An Animal is sleeping.");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.ruff();
		cat.meow();
		dog.eat();
		cat.eat();
		dog.run();
		cat.prance();
		System.out.println(dog.getAge());
		System.out.println(cat.getAge());
		cat.sleep();
		dog.sleep();
		// casting
		Object dog2 = new Dog();	
		Dog realDog = (Dog)dog2;
		realDog.ruff();
		
		// let see what happen
		Dog doggy = new Dog();
		if(doggy instanceof Animal){
			Animal a = (Animal)doggy;
			a.sleep();
		}
		doggy.sleep();
	}

}
