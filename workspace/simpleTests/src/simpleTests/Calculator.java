package simpleTests;

public class Calculator {
	interface IntegerMath{
		int operator(int a, int b);
	}
	
	public int operatorBinary(int a, int b, IntegerMath op){
		return op.operator(a, b);
	}
	public static void main(String[] args) {
		Calculator mytest = new Calculator();
		IntegerMath addition = (a, b) -> a + b;
		IntegerMath subtraction = (a, b) -> a - b;
		System.out.println("42 + 3 = " + 
		mytest.operatorBinary(42, 3, addition));
		System.out.println("35 - 5 = " + 
				mytest.operatorBinary(35, 5, subtraction));

	}

}
