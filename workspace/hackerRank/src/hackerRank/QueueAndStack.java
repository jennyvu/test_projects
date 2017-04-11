package hackerRank;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueAndStack {
	LinkedList<Character> stacky;
	LinkedList<Character> queuey;
	
	public QueueAndStack(){
		stacky = new LinkedList<Character>();
		queuey = new LinkedList<Character>();
	}
	public void pushCharacter(char c){
		stacky.addLast(c);
	}
	
	public void enqueueCharacter(char c){
		queuey.addLast(c);
	}
	
	public char popCharacter(){
		return stacky.removeLast();
	}
	
	public char dequeueCharacter(){
		return queuey.removeFirst();
	}
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueueAndStack p = new QueueAndStack();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

}
