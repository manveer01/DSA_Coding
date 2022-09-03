package day1;

import java.util.Arrays;

public class SquareArray {

	public static void main(String[] args) {
		int arr[]  = new int[] {-10 , -6 , 2 , 3 , 4};
		arr = squareArray(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	//o(nlogn)+ o(n)
//	static int[] squareArray(int arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			arr[i] =  arr[i]*arr[i];
//		}
//		Arrays.sort(arr);
//		return arr;
//	}
//	[-8 , -6 , -4 , 2 , 3, 4]
	
	//O(n) time
	static int[] squareArray(int arr[]) {
		int start=0;
		int end = arr.length-1;
		int temp [] = new int[arr.length];
		while(start<=end) {
			
			if(arr[start]*arr[start]> arr[end]*arr[end]) {
					temp[end-start] = arr[start]*arr[start];
					start++;
			}else {
				temp[end-start] = arr[end]*arr[end];
				end--;
			}
		}
		return temp;
	}

}
