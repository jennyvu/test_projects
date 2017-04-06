package simpleTests;

import java.util.Arrays;
import java.util.HashMap;

public class ProcessString {
	public static void processString(String str){
		char[] myArray = str.toCharArray();
		Arrays.sort(myArray);
		int count = 0;
		for(int i=0; i<str.length() -1; i++){
			count++;
			if(myArray[i] != myArray[i+1]){
				System.out.print(myArray[i]);
				System.out.print(count);
				count = 0;
			}
			if(i<str.length() -1)
				System.out.print(" ");
		}
		
	}
	
	public static char findFirstNonRepeat(String s){
		char first = s.charAt(0);
		HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
		for(char c: s.toCharArray()){
			char lc = Character.toLowerCase(c);
			Integer value = myMap.get(lc);
			if(value == null){
				myMap.put(lc, 1);
			}
			else{
				myMap.put(lc, value + 1);
			}
		}
		for(char c: s.toCharArray()){
			char lc = Character.toLowerCase(c);
			if(myMap.get(lc) == 1){
				first = c;
				break;
			}
		}
		return first;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "adlfjabdceqe";
		processString(s);
		System.out.println();
		String[] strArray = {"Mississippi", "Integration", "something"};
		for(int i=0; i<strArray.length; i++){
			char fc = findFirstNonRepeat(strArray[i]);
			System.out.println(fc);
		}
	}
}
