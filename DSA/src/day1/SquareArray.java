package day1;

import java.util.Arrays;

public class SquareArray {

	public static void main(String[] args) {
		int arr[]  = new int[] {-10 , -6 , 2 , 3 , 4};
		squareArray(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] squareArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i] =  arr[i]*arr[i];
		}
		Arrays.sort(arr);
		return arr;
	}

}
