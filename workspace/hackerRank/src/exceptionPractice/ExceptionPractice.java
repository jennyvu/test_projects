package exceptionPractice;

public class ExceptionPractice {

	public static void main(String[] args) {
		//int[] array = new int[10];
		//System.out.println(array[10]);
		try {
			int[] c = new int[6];
			System.out.println(c[5]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception throw "+ e);
		} finally {
			System.out.println("Finally finish try-catch-finally.");
		}
		//System.out.println("Finally finish try-catch.");
	}

}
