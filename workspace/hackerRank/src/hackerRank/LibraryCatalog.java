package hackerRank;

import java.util.*;

public class LibraryCatalog {
	Map<String, Book> bookCollection = new HashMap<String, Book>();
	int currentDay = 0;
	int checkOutPeriod = 7;
	double initialLateFee = 0.50;
	double feePerLateDay = 1.00;
	
	public LibraryCatalog(Map<String, Book> collection){
		this.bookCollection = collection;
	}
	
	public LibraryCatalog(Map<String, Book> collection, int checkOutPeriod, 
			double initialLateFee, double feePerLateDay){
		this.bookCollection = collection;
		this.checkOutPeriod = checkOutPeriod;
		this.initialLateFee = initialLateFee;
		this.feePerLateDay = feePerLateDay;
	}

	public Map<String, Book> getBookCollection(){
		return this.bookCollection;
	}
	
	public Book getBook(String bookTitle){
		return getBookCollection().get(bookTitle);
	}
	
	public int getCurrentDay(){
		return this.currentDay;
	}
	
	public int getCheckOutPeriod(){
		return this.checkOutPeriod;
	}
	
	public double getInitialLateFee(){
		return this.initialLateFee;
	}
	
	public double getFeePerLateDay(){
		return this.feePerLateDay;
	}
	
	public void nextDay(){
		currentDay++;
	}
	
	public void setDay(int day){
		currentDay = day;
	}
	
	public void checkoutBook(String bookTitle){
		Book book = getBook(bookTitle);
		if(book.getIsCheckOut()){
			sorryBookCheckedOut(book);
		}else{
			book.setIsCheckOut(true, currentDay);
			System.out.println("You just checked out book " + book.getTitle() + ", it is due on " +
			(getCurrentDay() + getCheckOutPeriod()));
		}
	}
	
	public void returnBook(String bookTitle){
		Book book = getBook(bookTitle);
		int lateDays = currentDay - (book.getDaysCheckOut() + checkOutPeriod);
		if(lateDays > 0){
			System.out.println("You owe $" + (initialLateFee + lateDays * getFeePerLateDay()) + 
					" for " + lateDays + " days late." );
		}else{
			System.out.println("Book is returned, Thank you,");
		}
		book.setIsCheckOut(false, -1);
	}
	
	public void sorryBookCheckedOut(Book book){
		System.out.println("Sorry, " + book.getTitle() + " is already checked out. " + 
				"It should be back on day " + (book.getDaysCheckOut() + getCheckOutPeriod()));
	}
	
	public void renewCheckOut(int newPeriod){
		this.checkOutPeriod = newPeriod;
	}
	
	public void setInitialLateFee(double newInitialLateFee){
		this.initialLateFee = newInitialLateFee;
	}
	
	public void setFeePerLateDay(double newFeePerLateDay){
		this.feePerLateDay = newFeePerLateDay;
	}
	
	public static void main(String[] args) {
		Map<String, Book> newCollection = new HashMap<String, Book>();
		Book harry = new Book("Harry Potter", 898989, 99999999);
		newCollection.put("Harry Potter", harry);
		LibraryCatalog lib = new LibraryCatalog(newCollection);
		lib.checkoutBook("Harry Potter");
		lib.nextDay();
		lib.nextDay();
		lib.checkoutBook("Harry Potter");
		lib.nextDay();
		lib.checkoutBook("Harry Potter");
		lib.returnBook("Harry Potter");
		lib.checkoutBook("Harry Potter");
		lib.nextDay();
		lib.checkoutBook("Harry Potter");
		lib.returnBook("Harry Potter");
		lib.checkoutBook("Harry Potter");
		lib.setDay(15);
		lib.returnBook("Harry Potter");
		lib.checkoutBook("Harry Potter");
	}

}
