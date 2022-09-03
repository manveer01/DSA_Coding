package day1;

public class SmallestCharacterGreaterThanTarget {

	public static void main(String[] args) {
		char[] c =  new char[] {'a' , 'd' , 'r' , 'y'};
		char target = 'r';
		System.out.println(smallestChar(c, target));

	}
	
	static char smallestChar(char[] c, char target) {
		int start = 0;
		int end = c.length-1;
		char nextChar = c[start];
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(target<c[mid]) {
				nextChar = c[mid];
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return nextChar;
	}

}
