package hackerRank;

import static hackerRank.HairColors.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	HairColors haircolor = BLOND;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}