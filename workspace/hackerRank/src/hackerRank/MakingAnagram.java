package hackerRank;
import java.util.Scanner;

public class MakingAnagram {
    public static int numberNeeded(String first, String second) {
    	int[] numberletters = new int[26];
    	//letter a will start at 0 and so on
		for(char c : first.toCharArray()){
			numberletters[c-'a'] += 1;
		}
		for(char c : second.toCharArray()){
			//will subtract if the same index.
			numberletters[c-'a'] -= 1;
		}
		int numOfOps = 0;
		for(int i : numberletters){
			numOfOps += Math.abs(i);
		}
		
		return numOfOps;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
        in.close();
        System.out.println(a.matches("([a-b]).*"));
    }
}