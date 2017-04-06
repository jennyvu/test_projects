package hackerRank;

public class Cat extends Animal{	
	public Cat(){
		super(7);
		System.out.println("A Cat has been created.");
	}
	
	public Cat(int age){
		super(age);
		System.out.println("A Cat has been created.");
	}

	public void meow(){
		System.out.println("The cat says meow.");
	}
	
	public void eat(){
		System.out.println("Cat is eating cat food.");
	}
	
	public void sleep(){
		System.out.println("The Cat is sleeping.");
	}
	
	public void prance(){
		System.out.println("The cat is prancing.");
	}
}
