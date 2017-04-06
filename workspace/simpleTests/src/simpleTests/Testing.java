package simpleTests;

import java.util.Arrays;
import java.util.*;

public class Testing {
	
	public static int[] removeDup(int[] a){
		int[] aa = new int[a.length];
		int j = 0;
		for(int i=1; i<a.length; i++){
			if(a[i-1] != a[i]){
				aa[j] = a[i - 1];
				j++;
			}
		}
		return aa;
	}
	
	public static boolean isAnagram(String s1, String s2){
		boolean check = true;
		if(s1.length() != s2.length()){
			return false;
		}else{			
			int[] numberletters = new int[26];
	    	//letter a will start at 0 and so on
			for(char c : s1.toCharArray()){
				numberletters[c-'a'] += 1;
			}
			for(char c : s2.toCharArray()){
				//will subtract if the same index.
				numberletters[c-'a'] -= 1;
			}
			int value = 0;
			for(int i : numberletters){
				value += Math.abs(i);
			}
			if(value != 0){
				check = false;
			}
	    }
		return check;
	}
	
	public static void reverseStringWords(String s){
		String[] a = s.split(" ");
		Stack<String> st = new Stack<String>();
		for(String w: a){
			st.push(w);
		}
		String reverse = new String();
		while(!st.isEmpty()){
			reverse += st.pop() + " ";
		}
		System.out.println(reverse);
	}
	
	public static int findPairs(int sum){
		int count = 0;
		int max = 50;
		if(Math.abs(sum) < (max * 2 - 1) && Math.abs(sum) > max){
			count = (int)Math.ceil((max - (sum - max))/2.0);
		}else{
			count =  (int) ((max - Math.abs(sum)) + Math.ceil(Math.abs(sum)/2.00));	
		}
		return count;
	}
	
	public static LinkedList<Integer> numToLinkedList(int n){
		LinkedList<Integer> list = new LinkedList<Integer>();
		String s = Integer.toString(n);
		for(char c: s.toCharArray()){
			int a = Character.getNumericValue(c);
			//int a = Integer.parseInt(String.valueOf(c));
			list.add(a);
		}
		return list;
	}
	
	public static LinkedList<Integer> sumOf2Lists(LinkedList<Integer> list1, 
			LinkedList<Integer> list2){
		LinkedList<Integer> sumlist = new LinkedList<Integer>();
		for(Iterator<Integer> iter1 = list1.iterator(), iter2 = list2.iterator(); 
				(list1.size() > list2.size())?iter1.hasNext():iter2.hasNext();){
			if(iter1.hasNext() && iter2.hasNext()){
				sumlist.add(iter1.next() + iter2.next());
			}else if(iter1.hasNext()){
				sumlist.add(iter1.next());
			}else{
				sumlist.add(iter2.next());
			}
						
		}	
		return sumlist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
		System.out.println(apple.getColor());
		//Jeep newjeep = new Jeep();
		//System.out.println(newjeep.getColor());
		
		// remove duplication from array of number
		//int[] a = {1,2,2,2,3,4,5,6,6,7,8,9,9,10};
		//System.out.println(Arrays.toString(removeDup(a)));
		
		// check anagram
		System.out.println(isAnagram("cabbc", "ccabb"));
		
		// reverse string words
		//String s = "This is a test";
		//reverseStringWords(s);
		
		// count pairs
		//System.out.println(findPairs(5));
		
		// linked list
		System.out.println(numToLinkedList(12345));
		System.out.println(sumOf2Lists(numToLinkedList(123456), numToLinkedList(5432)));
	}

}
