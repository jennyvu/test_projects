

import java.util.Scanner;

public class ArrayLeftRotation {
	public static int[] rotateLeft(int a[], int k){
		if(k <= a.length && k >=1){
			int temp[] = new int[k];
			for(int r=0; r<k; r++){
				temp[r] = a[r];
			}
			for(int i=0; i<a.length - k; i++){
				a[i] = a[i + k];
			}
			int index = 0;
			for(int j=a.length - k; j<a.length; j++){
				a[j] = temp[index];
				index += 1;
			}
		}
		else System.exit(1);
		return a;
	}
	
	public static int[] rotate(int a[], int k){
		int r = 1;
		int ra[] = rotateLeft(a, k);
		while(r < k){
			r++;
			ra = rotateLeft(ra, k);
		}
		return ra;
	}

	public static void printResult(int a[]){
		for(int e: a){
			System.out.print(e);
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        if(n <= 100000 || n >= 1){
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            if(k >=1 && k <= n){
                int newArray[] = rotateLeft(a, k);
                printResult(newArray);  
            }
            else System.exit(1);
        }
        else System.exit(1);
     
        in.close();
	}

}
