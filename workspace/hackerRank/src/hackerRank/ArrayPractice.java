package hackerRank;

import java.util.Arrays;

public class ArrayPractice {
	
	public static <E> void printArray(E[] array){
		System.out.print("[");
		for(E element: array){
			System.out.print(element + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] intArray1 = new int[5];
		Integer[] intArray2 = new Integer[4];
		Integer[] intArray3 = {1, 3, 5, 7, 9};
		String[] strArray = new String[10];
		String[] shoppingList = {"onion", "cilantro", "bananas", "apples"};
		
		// print out array
		System.out.println(Arrays.toString(intArray2));
		System.out.println(Arrays.toString(intArray3));
		System.out.println(Arrays.toString(strArray));
		System.out.println(Arrays.toString(shoppingList));
		
		// custom print
		printArray(intArray3);
		printArray(shoppingList);
		
		//retrieve object
		System.out.println(intArray3[4]);
		
		//special for loop: foreach
		System.out.println("Special For Loop");
		for(String s: shoppingList){
			System.out.print(s + " ");
		}
		
	}

}
