package hackerRank;

public class Generic {
	
	public static <T extends Comparable <T>> T findMax(T a, T b){
		int n = a.compareTo(b);
		if(n > 0){
			return a;
		}else{
			return b;
		}
	}

	public static void main(String[] args) {
		System.out.println(findMax(2, 3));
		System.out.println(findMax(3, 3));
		System.out.println(findMax(3, 2));
		System.out.println(findMax("Hi", "there"));
	}

}
