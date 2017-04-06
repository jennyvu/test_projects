package hackerRank;

public class Car {
	int maxSpeed = 120;
	int minSpeed = 0;
	
	double weight = 50000;
	
	boolean isCarOn = false;
	char condition = 'A';
	
	double maxFuel = 17;
	double currentFuel = 8;
	double mpg = 26.4;
	
	int numberOfPeopleInCar = 1;
	
	public Car(){}
	
	public Car(int customMinSpeed, int customMaxSpeed, 
			char customCondition, double customWeight){
		minSpeed = customMinSpeed;
		maxSpeed = customMaxSpeed;
		condition = customCondition;
		weight = customWeight;
	}
	
	public char getCondition(){
		return this.condition;
	}
	
	public int getMinSpeed(){
		return this.minSpeed;
	}
	
	public double getCurrentFuel(){
		return this.currentFuel;
	}
	
	public int getMaxSpeed(){
		return this.maxSpeed;
	}
	
	public int getNumberOfPeopleInCar(){
		return this.numberOfPeopleInCar;
	}
	
	public void setMaxSpeed(int newMaxSpeed){
		this.maxSpeed = newMaxSpeed;
	}
	
	public void getIn(){
		if(numberOfPeopleInCar < 4){
			numberOfPeopleInCar += 1;
		}
		else{
			System.out.println("Reach Max Capacity");
		}
	}
	
	public void getOut(){
		if(numberOfPeopleInCar >= 1){
			numberOfPeopleInCar -= 1;
		}
		else{
			System.out.println("No oneelse to get out.");
		}
	}
	
	public double getAverageMillageLeft(){
		return currentFuel * mpg;
	}
	
	public void printVariables(){
		System.out.println("Car variables:");
		System.out.println(maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isCarOn);
		System.out.println(condition);
		System.out.println("Number of people in the car: " + numberOfPeopleInCar);
		System.out.println("Average Millage left: " + getAverageMillageLeft());
	}
	
	public void changeCondition(char c){
		condition = c;
	}
	
	public void upgradeMaxSpeed(int newSpeed){
		maxSpeed = newSpeed;
	}
	
	protected String getColor(){
		return "Green";
	}
	
    public static void main(String[] args) { 
    	Car familyCar = new Car();
    	familyCar.printVariables();
    	familyCar.changeCondition('C');
    	familyCar.printVariables();
    	// new car
    	Car presentCar = new Car(0, 260, 'A', 4500);
    	presentCar.printVariables();
    	Car myCar = new Car(0, 260, 'A', 6600);
    	myCar.getIn();
    	myCar.getIn();
    	myCar.isCarOn = true;
    	myCar.currentFuel = 12;
    	myCar.printVariables(); 	
    }

}
