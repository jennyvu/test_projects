package hackerRank;

import java.util.*;

public class LoopPractice {
	public static void whileLoop(int n){
		//print n first 10 multiples
		int i = 1;
		while(i <= 10){
			System.out.println(n + " x " + i + " = " + n*i);
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        whileLoop(n);
        in.close();
	}

}
