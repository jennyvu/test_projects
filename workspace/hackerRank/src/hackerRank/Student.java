package hackerRank;

public class Student extends Person{
	private int[] testScores;
	
	public Student(String firstName, String lastName, int id, int[] scores){
		super(firstName, lastName, id);
		testScores = scores;
	}
	
	public Character calculate(){
		char grade;
		double sum = 0;
		for(int i=0; i<testScores.length; i++){
			sum += testScores[i];
		}
		Double average = sum/testScores.length;
		if( average >= 90.00 && average <= 100.00){
			grade = 'O';
		}else if(average >= 80.00 && average < 90.00){
			grade = 'E';
		}else if(average >= 70.00 && average < 80.00){
			grade = 'A';
		}else if(average >= 55.00 && average < 70.00){
			grade = 'P';
		}else if(average >= 40.00 && average < 55.00){
			grade = 'D';
		}else{
			grade = 'T';
		}
		return grade;
	}

}
