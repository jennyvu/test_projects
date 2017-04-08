package hackerRank;

import java.util.Arrays;
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
	
	public static Node insert(Node head, int data){
		Node temp = new Node(data);
		if(head == null){
			head = temp;
		}else{
			Node cur = head;
			while(cur.next != null){
				cur = cur.next;
			}
			cur.next = temp;
		}
		return head;
	}
	
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
	
	public static void bubbleSortAsc(int[] a){
		int numberOfSwaps = 0;
		for(int i=0; i<a.length; i++){
			int swaps = 0;
			for(int j=0; j<a.length - 1; j++){
				if(a[j] > a[j + 1]){
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swaps++;
				}
			}
			if(swaps == 0){
				break;			
			}
			numberOfSwaps += swaps;
		}
		System.out.println("Array is sorted in "+ numberOfSwaps +" swaps.");
		System.out.println("First Element: "+ a[0]);
		System.out.println("Last Element: "+ a[a.length - 1]);
	}
	
	public static void stringToInteger(String s){
		try{
			int integer = Integer.parseInt(s);
			System.out.println(integer);
		} catch (NumberFormatException  e){
			System.out.println("Bad String.");
		}
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
    	
    	// Array find median
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
    	/*
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
        */
    	
    	//LinkedList
    	/*
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
        */
    	
    	//Bubble sort
    	/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubbleSortAsc(a);
        in.close(); 
        */
    	
    	// String to integer handling exception
    	/*
    	Scanner in = new Scanner(System.in);
        String S = in.next();
        stringToInteger(S);
        in.close();
        */
    	
    	// sort array using comparator
    	/*
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
        */
    	
    	// Merge sort
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            MergeSort msort = new MergeSort();
            System.out.println(msort.mergeSort(arr));
        }
        in.close();
    }
}
