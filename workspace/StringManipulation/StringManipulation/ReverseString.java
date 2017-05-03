package StringManipulation;

import java.util.Scanner;

public class ReverseString {
	/*
	 * Read a String with multiple words and reverse order of characters word by word
	 * this is one of interview question, I used additional char array to hold the
	 * reversed word but interviewer comment that is performance issue could do swap
	 * order in the same array, let test it out
	 */
	
	public static String reverseString(String str) {
		String rStr = new String();
		if (str.isEmpty() || str == null) {
			return str;
		}
		String[] arStr = str.split(" ");
		for(String s: arStr) {
			char[] ra = new char[s.length()];
			for(int i = 0; i < s.length(); i++) {
				ra[i] = s.charAt(s.length() - i - 1);
			}
			rStr += String.valueOf(ra) + " ";
		}
		return rStr;
	}

	public static String reverseString2(String str) {
		String rStr = new String();
		if (str.isEmpty() || str == null) {
			return str;
		}
		String[] arStr = str.split(" ");
		for(String s: arStr) {
			char[] ra = s.toCharArray();
			for(int i = 0; i < s.length()/2; i++) {
				char temp = ra[i];
				ra[i] = ra[s.length() - i - 1];
				ra[s.length() - i - 1] = temp;
			}
			rStr += String.valueOf(ra) + " ";
		}		
		return rStr;
	}
	
	public static void main(String[] args) throws InterruptedException {
		// will get input from console
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		/*
		String str = "Read a String with multiple words and revert order of characters word by word " + 
		"this is one of interview question, I used additional char array to hold the" +
		" reversed word but interviewer comment that is performance issue could do swap" +
		" order in the same array, let test it out";
		*/
	    Thread t1 = new Thread(new Runnable() {
	         public void run() {
	        	 System.out.println(reverseString(str));
	         }
	    }); 		
	    Thread t2 = new Thread(new Runnable() {
	         public void run() {
	        	 System.out.println(reverseString2(str));
	         }
	    });  
	    
		long startTime = System.currentTimeMillis();
		//System.out.println(reverseString(str));  
	    t1.start();
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Start at: " + startTime);
		System.out.println("End at: " + endTime);
		System.out.println("Test: " + duration + "ms");
		
		//sleep for 2s
		/*
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        */
        
		startTime = System.currentTimeMillis();
		//System.out.println(reverseString(str)); 
	    t2.start();
		endTime = System.currentTimeMillis();
		long duration2 = endTime - startTime;
		System.out.println("Start at: " + startTime);
		System.out.println("End at: " + endTime);
		System.out.println("Test: " + duration2 + "ms");
		
		if (duration > duration2) {
			System.out.println("She was right!");
		} else {
			System.out.println("Not alway right!");
		}
		
	}

}
