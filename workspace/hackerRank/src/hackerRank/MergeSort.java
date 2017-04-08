package hackerRank;

import java.util.Arrays;

public class MergeSort {
	
	public long mergeSort(int[] a){	
		long swaps =  mergeSort(a, new int[a.length], 0, a.length - 1);
		//System.out.println(Arrays.toString(a));
		return swaps;
	}
	
	private static long mergeSort(int[] arr, int[] temp, int start, int end){
		long count = 0;
		if(start == end) return 0;
		int mid = Math.floorDiv(start + end, 2);
		count += mergeSort(arr, temp, start, mid);
		count += mergeSort(arr, temp, mid + 1, end);
		count += merge(arr, temp, start, mid, end);
		return count;
	}

	private static long merge(int[] arr, int[] temp, int start, int mid, int end){
		int curr = start;
		int left = start;
		int right = mid + 1;
		long count = 0;
		while(left <= mid && right <= end){
			if(arr[left] <= arr[right]){
				temp[curr] = arr[left];
				left++;
			}else{
				temp[curr] = arr[right];
				right++;
				count += mid - left + 1;
			}
			curr++;
		}
		System.arraycopy(arr, left, temp, curr, mid - left + 1);
		System.arraycopy(arr, right,  temp,  curr, end - right + 1 );
		System.arraycopy(temp, start, arr, start, end - start + 1 );
		return count;
	}	
}
