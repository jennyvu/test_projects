package hackerRank;

import java.util.*;

public class ConditionalStatement {
	   
	public static void main(String[] args) throws Exception {
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      scan.close();
	      String ans="";
	          
	      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	      if(n%2==1){
	         ans = "Weird";
	      }
	      else{
	         // Complete the code 
	    	  if(n<6 || n>20){
	    		  ans = "Not Weird";
	    	  }
	    	  else{
	    		  ans = "Weird";
	    	  }
	      }
	      System.out.println(ans);
	   }
	}
