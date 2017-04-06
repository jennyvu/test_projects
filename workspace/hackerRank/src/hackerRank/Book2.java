package hackerRank;

public abstract class Book2 {
    String title;
    String author;
    
    Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}
