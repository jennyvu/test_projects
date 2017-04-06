package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class CalLargestSumHourglasses {
	public static int findLargestSum(int[][] a){
		//int largest = 0;
		int[] sum = new int[16];
		int z = 0;
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				sum[z] = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + 
						a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
				z++;
			}
		}
		Arrays.sort(sum);
		return sum[15];		
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(findLargestSum(arr));
        in.close();
    }

}
