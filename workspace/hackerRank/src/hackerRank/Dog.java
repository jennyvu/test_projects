package hackerRank;

public class Dog extends Animal{
	public Dog(){
		super(1);
		System.out.println("A Dog has been created.");
	}

	public void ruff(){
		System.out.println("The dog says roff.");
	}
	
	public void run(){
		System.out.println("The dog is running.");
	}
	
	public void eat(){
		System.out.println("Dog is eating dog chow.");
	}
	
	public void sleep(){
		System.out.println("The Dog is sleeping.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
