package hackerRank;

import java.util.List;
import java.util.Scanner;


public class Solution {
	
	public static int factorial(int n){
		if(n == 1){
			return 1;
		}
		else{
			return n * factorial(n -1);
		}
	}
	
	public static double findMedian(List<Integer> list){
		double median = 0;
		//System.out.println(Arrays.toString(array));
		System.out.println(list.toString());
		if(list.size() % 2 == 1){
			median = list.get(Math.abs(list.size()/2));
		}else{
			median = (list.get(list.size()/2 - 1) + list.get(list.size()/2)) / 2.0; 
		}		
		return median;
	}

    public static void main(String[] args) { 
    	/*
    	Scanner scan = new Scanner(System.in);
    	String input = "Hi there!";
    	if(scan.hasNext()){
    		input = scan.next();
    	}
    	else
    		scan.close();
    	System.out.println("Hello World!");
    	System.out.println(input);
    	*/
    	// array
    	/*
    	Scanner scan = new Scanner(System.in);
    	int t = scan.nextInt();
    	String s;
    	for(int i=0; i<t; i++){
    		s = scan.next();
    		char[] myArr = s.toCharArray();
    		for(int a = 0; a < s.length(); a +=2){
    		    // Print each sequential character on the same line
    		    System.out.print(myArr[a]); 
    		}
    		System.out.print(" "); 
    		for(int b = 1; b < s.length(); b +=2){
    		    // Print each sequential character on the same line
    		    System.out.print(myArr[b]); 
    		}
    		// Print a newline
    		System.out.println();    		
    	} 
    	scan.close();
    	*/
    	// calculate factorial
    	/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
        */
    	
    	// Array
    	/*
    	List<Integer> list = new ArrayList<Integer>();
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a_i=0; a_i < n; a_i++){
            int item = in.nextInt();
            int i = Collections.binarySearch(list, item);
            if(i < 0) i = Math.abs(i)-1;
            list.add(i, item);
            System.out.println(findMedian(list));
        }
        in.close();
        */
    	//abstract class
    	/*
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book2 book = new MyBook(title, author, price);
        book.display();
        */
    	//find maximunDifferent
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
    	Difference difference = new Difference(a);
    	difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}