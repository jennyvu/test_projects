package simpleTests;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int i2;
        double d2;
        String s2;
        String line1, line2;

        /* Read and save an integer, double, and String to your variables.*/
        line1 = scan.nextLine();
        i2 = Integer.parseInt(line1);
        line2 = scan.nextLine();
        d2 = Double.parseDouble(line2);
        s2 = scan.nextLine();       
        
        System.out.println(i+i2);
        System.out.println(d+d2);
        System.out.println(s + s2);
        scan.close();
    }

}
