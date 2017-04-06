package hackerRank;

import java.util.*;

public class BinanyNumbers {
	public static String a = new String();
	
	public static void convertToBinary(int number){
		if(number > 0){
			int digit = number % 2;
			a = Integer.toString(digit) + a;
			convertToBinary(number/2);
		}
	}
	
	public static int findConsecutiveOnes(int number){
		int c = 0, t = 0;
		while(number > 0){
			int r = number % 2;
			if(r == 1){
				c += 1;
				if(c >= t){
					t = c;
				}
			}else{
				c = 0;
			}
			number /= 2;
		}
		return t;	
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        convertToBinary(n);
        System.out.println(a);
        System.out.println(findConsecutiveOnes(n));
        in.close();
    }

}
