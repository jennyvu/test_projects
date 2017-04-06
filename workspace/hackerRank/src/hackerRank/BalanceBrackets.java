package hackerRank;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackets {
	/*
	public static boolean isBalanced(String expression) {
        boolean match = true;
        Stack<Character> stack = new Stack<Character>();
        int len_exp = expression.length();
        if(len_exp % 2 != 0){
        	return false;
        }else{
        	for(int i=0; i<expression.length(); i++){
        		char br = expression.charAt(i);
        		if(isOpenBracket(br)){
        			stack.push(br);
        		}else if(isCloseBracket(br)){
        			if(stack.size() > 0 && 
        					matchBrackets((char)stack.elementAt(stack.size() - 1), br)){
        				stack.pop();
        			}else match=false;
        		}else match=false;
        	}
        }
        if(stack.size() != 0)
            match = false;

        return match;
    }
	
	public static boolean isOpenBracket(char br){
	    if (br == '{' || br == '[' || br == '('){
	    	return true;
	    }else return false;
	}

	public static boolean isCloseBracket(char br){
	    if (br == '}' || br == ']' || br == ')'){
	    	return true;
	    }else return false;
	}
	
	public static boolean matchBrackets(char l, char r){
	    if (l == '(' && r == ')'){
	    	return true;
	    }else if (l == '{' && r == '}'){
	    	return true;
	    }else if (l == '[' && r == ']'){
	    	return true;
	    }else return false;
	}
	// different way to solve
	public static boolean isBalanced(String expression) {
		// Must be even
		if (expression.length() % 2 != 0) return false;
		else {
		  char[] brackets = expression.toCharArray();
		  Stack<Character> s = new Stack<>();
		  for (char bracket : brackets)
		    switch (bracket) {
		      case '{': s.push('}'); break;
		      case '(': s.push(')'); break;
		      case '[': s.push(']'); break;
		      default :
		        if (s.empty() || bracket != s.peek())
		          return false;
		        s.pop();
		    }
		  return s.empty();
		}
	}
	*/
	public static boolean isBalanced(String expression) {
		// Must be even
		if (expression.length() % 2 != 0) return false;
		else {
			char[] brackets = expression.toCharArray();
			Stack<Character> st = new Stack<>();
			for (char br : brackets){
				if (br == '{') st.push('}');
				else if (br == '(') st.push(')');
				else if (br == '[') st.push(']');
				else{
					if(!st.empty() && br == st.peek())
						st.pop();
					else return false;
				}
			}
			return st.empty();
		}
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
        in.close();
	}

}
