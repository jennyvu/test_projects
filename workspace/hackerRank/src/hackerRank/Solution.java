package hackerRank;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

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
	
	Node RemoveDuplicates(Node head) {
	    if(head == null || head.next == null){
	        return head;
	    }
	    Node newHead = head;
	    while(head.next != null) {
	        if (head.data != head.next.data) {
	            head = head.next;
	        } else {
	            head.next = head.next.next;
	        }		
	    }
	    return newHead;

	}
	
	Node Reverse(Node head) {
	    if(head == null || head.next == null){
	        return head;
	    }
	    Node newHead = head;
		head.next.next = head;
		head.next = null;
	    return newHead;
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

	public static BSTNode insert(BSTNode root,int data){
        if(root==null){
            return new BSTNode(data);
        }
        else{
            BSTNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
	public static void levelOrder(BSTNode root){
		if (root != null) {
			Queue<BSTNode> queue = new LinkedList<BSTNode>();
			queue.clear();
			queue.add(root);
			while(!queue.isEmpty()) {
				BSTNode node = queue.remove();
				System.out.println(node.data);
				if(node.left != null) {
					queue.add(node.left);
				}
				if(node.right != null) {
					queue.add(node.right);
				}
			}
		}		
	}
	
	public static int FindMergeNode(Node headA, Node headB) {
	    Node curA = headA;
	    Node curB = headB;
	    while (curA != curB) {
	    	// which ever hit null will wrap around start from 
	    	// other head.
	    	if (curA.next == null) {
	    		curA = headB;
	    	} else {
	    		curA = curA.next;
	    	}
	    	if (curB.next == null) {
	    		curB = headA;
	    	} else {
	    		curB = curB.next;
	    	}
	    		    	
	    }
	    return curA.data;
	}
	
	public static String identityPrime(long n) {
        if(n == 2){
            return "Prime";
        }
    	if(n == 1 || n % 2 == 0) {
    		return "Not prime";
    	}
    	for(int k = 3; k <= Math.sqrt(n); k += 2) {
    		if(n % k == 0) {
    			return "Not prime";
    		}
    	}
    	return "Prime";
	}
	
	public static void calculateFine(LocalDate dateReturn, LocalDate dateExpect) {
    	int fine = 0;
    	if (dateReturn.isAfter(dateExpect)) {
    		if (dateReturn.getYear() == dateExpect.getYear()) {
    			if (dateReturn.getMonth() == dateExpect.getMonth()) {
    				int diffD = (int) ChronoUnit.DAYS.between(dateExpect, dateReturn);
    				fine = 15 * diffD;
    			} else {
    				int diffM = (int) ChronoUnit.MONTHS.between(dateExpect, dateReturn);
    				fine = 500 * diffM;
    			}
    		} else {
    			fine = 10000;
    		}
    	}
    	System.out.println(fine);
	}
	
	public static void randTestCases(int t) {
		Random rand = new Random();
		if (t <= 5) {
			System.out.println(t);
			for (int c = 0; c < t; c++){
				int n = rand.nextInt(203) + 3;
				int k = rand.nextInt(n + 1) + 1;
				System.out.println(n + " " + k);
				for (int i = 0; i < n; i++) {
					System.out.print((rand.nextInt(1001) - rand.nextInt(1001)) + " ");
				}
				System.out.println();
			}
		}
	}
	
	public static void findOptions(int[] a, int sum) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] + a[j] == sum) {
					System.out.println((i + 1) + " " + (j + 1));
					break;
				}
			}
		}
	}
	
	public static void findLargestRegion(int[][] a) {
		int largest = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				largest = Math.max(largest, countConnected(a, i, j));
			}
		}
		System.out.println(largest);
	}
	
	public static int poisonousPlants(LinkedList<Integer> plants, int day) {
		int days = day;
		int k = plants.size() - 1;
		int count = 0;
    	while(k > 0) {
    		if (plants.get(k) > plants.get(k - 1)) {
    			//System.out.println(plants.get(k));
    			plants.remove(k);
    			count += 1;
    		}
    		k--;
    	}
    	if (count == 0) {
    		return days;
    	}
    	
    	if (plants.size() > 0 && count > 0) {
    		poisonousPlants(plants, days + 1);
    	}
    	
    	return days + 1;
	}
	
	public static int countConnected(int[][] a, int i, int j) {
		// checkout out of bound
		if (i < 0 || j < 0 || i >= a.length || j >= a[0].length) {
			return 0;
		}
		// check not filled
		if (a[i][j] == 0) {
			return 0;
		}
		int sum = a[i][j]--;
		sum += countConnected(a, i - 1, j - 1);
		sum += countConnected(a, i - 1, j);
		sum += countConnected(a, i - 1, j + 1);
		sum += countConnected(a, i, j - 1);
		sum += countConnected(a, i, j + 1);
		sum += countConnected(a, i + 1, j - 1);
		sum += countConnected(a, i + 1, j);
		sum += countConnected(a, i + 1, j + 1);
		return sum;
	}
	
    public static void main(String[] args) throws ParseException { 
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
    	//consider using LinkedList
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
    	/*
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
        */
    	
    	// More exception
    	/*
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
        */
    	
    	//using interface AdvancedArithmetic
    	/*
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
        */
    	
    	// printArray
    	/*
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
        scanner.close();
        */
    	
    	//Binary Search Tree Test Bread-first-search travel print tree
    	/*
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BSTNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
        sc.close();
        */
    	
    	// identify prime number
    	/*
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t >= 1) {
        	int n = sc.nextInt();
        	System.out.println(identityPrime(n));
            t--;
        }
        sc.close();
        */
    	
    	// Day 26: calculate fee
    	/*
    	Scanner sc = new Scanner(System.in);
    	int actualDate = sc.nextInt();
    	int actualMonth = sc.nextInt();
    	int actualYear = sc.nextInt();
    	int expectDate = sc.nextInt();
    	int expectMonth = sc.nextInt();
    	int expectYear = sc.nextInt();
    	sc.close();
    	int fine = 0;
    	if (actualYear - expectYear > 0) {
    		fine = 10000;
    	} else if (actualYear - expectYear == 0) {
    		if (actualMonth - expectMonth > 0) {
        		fine = 500 * (actualMonth - expectMonth);
    		} else if (actualMonth - expectMonth == 0) {
    			if (actualDate - expectDate > 0) {
    				fine = 15 * (actualDate - expectDate);
    			}
    		}
    	} 
    	System.out.println(fine);
    	*/
    	// Using LocalDate
    	/* 
    	LocalDate dateReturn = LocalDate.of(actualYear, actualMonth, actualDate);
    	LocalDate dateExpect = LocalDate.of(expectYear, expectMonth, expectDate);
    	int fine = 0;
    	if (dateReturn.isAfter(dateExpect)) {
    		if (dateReturn.getYear() == dateExpect.getYear()) {
    			if (dateReturn.getMonth() == dateExpect.getMonth()) {
    				int diffD = (int) ChronoUnit.DAYS.between(dateExpect, dateReturn);
    				fine = 15 * diffD;
    			} else {
    				int diffM = (int) ChronoUnit.MONTHS.between(dateExpect, dateReturn);
    				fine = 500 * diffM;
    			}
    		} else {
    			fine = 10000;
    		}
    	}
    	System.out.println(fine);
    	*/
    	
    	// Day 27: create and print a test case
    	//randTestCases(5);
    	
    	// Day 28: RegEx, Patterns, and Intro to Databases
    	/*
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String emailRegEx = ".+@gmail\\.com$";
    	List<String> list = new ArrayList<String>();
    	for (int i = 0; i < n; i++) {
    		String name = sc.next();
    		String email = sc.next();
    		if (email.matches(emailRegEx)) {
    			list.add(name);
    		}
    	}
    	sc.close();
    	Collections.sort(list);
    	for (String name: list) {
    		System.out.println(name);
    	}
    	*/
    	
    	// Day 29: Bitwise AND
    	/*
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	for (int i = 0; i < t; i++) {
    		int n = sc.nextInt();
    		int k = sc.nextInt();
    		int maxVal = 0;
    		for (int p = 1; p < n; p++) {
    			for (int q = p+1; q <= n; q++) {
    				int val = p&q;
    				if (val < k && val > maxVal) {
    					maxVal = val;
    				}
    			}
    		}
    		System.out.println(maxVal);
    	}
    	sc.close();   
    	*/
    	
    	// challenge Ice cream parlor
    	/*
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            findOptions(a, m);
        }
        in.close();
         */
    	
    	// DFS: Connected Cell in a Grid
    	/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        findLargestRegion(grid);
        */
    	
    	// find largest rectangle
    	/*
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a0 = 0; a0 < n; a0++) {
        	a[a0] = in.nextInt();
        }  
        int i = 0;
        int largest = 0;
        Stack<Integer> st = new Stack<Integer>();
        while (i < n) {
        	if (st.empty() || a[st.peek()] <= a[i]) {
        		st.push(i);
        		i++;
        	} else {
        		int x = st.peek();
        		st.pop();
        		int area = a[x] * (st.empty() ? i : (i - st.peek() - 1));
        		largest = Math.max(largest, area);
        	}
        }
        
        while (!st.empty()) {
        	int x = st.peek();
        	st.pop();
        	int area = a[x] * (st.empty() ? i : i - st.peek() - 1);
        	largest = Math.max(largest, area);
        }
        System.out.println(largest);
        in.close();
        */
        
        // Pangrams are sentences constructed 
        // by using every letter of the alphabet at least once.
        /*
    	Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for(char c: s.toCharArray()) {
        	if(c != ' ') {
            	if (charMap.containsKey(c)) {
            		int value = charMap.get(c);
            		charMap.put(c, value + 1);
            	} else {
            		charMap.put(c, 1);
            	} 
        	}       	
        }
     
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String ans = "pangram";
        for (char ea: alphabet.toCharArray()) {
        	if (!charMap.containsKey(ea)) {
        		System.out.println(charMap.get(ea));
        		ans = "not pangram";
        		break;
        	}
        }
        System.out.println(ans);
        sc.close();
        */
        //or
    	/*
    	Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String ans = "pangram";
        for (char c: alphabet.toCharArray()) {
        	if (s.contains(String.valueOf(c)) == false) {
        		ans = "not pangram";
        		break;
        	}
        }
        System.out.println(ans);
        sc.close();
        */
    	
    	// funny String 
    	/*
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	for (int i = 0; i < t; i++) {
    		String s = sc.next();
    		// reverse string
    		char[] ar = s.toCharArray();
    		//char[] ra = new char[s.length()];
    		String ans = "funny";
    		for (int j = 1; j < ar.length; j++) {
    			//ra[j] = ar[ar.length - j - 1];
    			if (Math.abs(ar[j] - ar[j - 1]) != 
    					Math.abs(ar[ar.length - j] - ar[ar.length - j - 1])) {
    				ans = "not funny";
    				break;
    			}
    		}

    		// check if funny String
    		// R is the reverse of String of S. S is funny if the condition 
    		// S|i| - S|i - 1| == R|i| - R|i - 1|  is true for every character i
    		// from 1 to N - 1
    		
    		//String ans = "funny";
    		//for (int k = 1; k < ar.length; k++) {
    		//	if (Math.abs(ar[k] - ar[k - 1]) != Math.abs(ra[k] - ra[k - 1])) {
    		//		ans = "not funny";
    		//	}
    		//}
    		
    		System.out.println(ans);
    	}
    	sc.close();
    	*/
    	
    	// Poisonous Plants
    	// There are  plants in a garden. Each of these plants has been added with 
    	// some amount of pesticide. After each day, if any plant has more pesticide 
    	// than the plant at its left, being weaker than the left one, it dies. 
    	// You are given the initial values of the pesticide in each plant. 
    	// Print the number of days after which no plant dies, i.e. the time after 
    	// which there are no plants with more pesticide content than the plant to 
    	// their left.
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	LinkedList<Integer> plants = new LinkedList<Integer>();
    	for (int i = 0; i < n; i++) {
    		int p = sc.nextInt(); 
    		plants.add(p);
    	}
    	
    	/*
    	int days = 0;
    	int count = 0;
    	while (plants.size() > 0) {    		
    		count = 0;
    		int k = plants.size() - 1;
        	while(k > 0) {
        		if (plants.get(k) > plants.get(k - 1)) {
        			System.out.println(plants.get(k));
        			plants.remove(k);
        			count += 1;
        		}
        		k--;
        	}
        	if (count == 0) {
        		break;
        	}
        	days++;
    	}
    	*/
    	
    	int maxdays = 0;
    	int days = 0;
    	int survive = plants.get(0);
    	for (int i = 1; i < n; i++) {
    		int plant = plants.get(i);
    		if (plant > survive) {
    			boolean noDie = false;
    			for (int j = 0; j < days; j++) {
    				if (plant > plants.get(j)) {
    					
    				}
    			}
    			
    		}
    	}
    	
    	System.out.print(days);
    	sc.close();
    	
    }
}
