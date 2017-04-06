package hackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapRansomNote {
	public static boolean ransomNote(String []magazine, String []note){
		HashMap<String, Integer> magazineMap = new HashMap<String, Integer>();
		if (note.length > magazine.length){
			return false;
		}
		for(String word: magazine){
			Integer value = magazineMap.get(word);
			if(value == null){
				magazineMap.put(word, 1);
			}else{
				magazineMap.put(word, value + 1);
			}
		}
		Integer count = 0;
		for(String word: note){
			Integer value = magazineMap.get(word);
			if(value != null && value > 0){
				magazineMap.put(word, value - 1);
				count++;
			}else{
				break;
			}
		}
		return note.length == count;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        boolean result = ransomNote(magazine,ransom);
        if(result){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
        in.close();
	}

}
