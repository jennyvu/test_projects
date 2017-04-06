package hackerRank;

public class Book {
	String title;
	int pageCounts;
	int isbn;
	Boolean isCheckOut;
	int daysCheckOut = -1;
	
	public Book(String bookTitle, int bookPageCounts, int bookISBN){
		this.title = bookTitle;
		this.pageCounts = bookPageCounts;
		this.isbn = bookISBN;
		isCheckOut = false;
	}

	public String getTitle(){
		return this.title;
	}
	
	public int getPageCounts(){
		return this.pageCounts;
	}
	
	public int getISBN(){
		return this.isbn;
	}
	
	public boolean getIsCheckOut(){
		return this.isCheckOut;
	}
	
	public int getDaysCheckOut(){
		return this.daysCheckOut;
	}
	
	public void setIsCheckOut(boolean checkout, int days){
		this.isCheckOut = checkout;
		this.setDaysCheckOut(days);
	}
	
	private void setDaysCheckOut(int days){
		this.daysCheckOut = days;
	}
}
