package day1;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 20;
		printFibnacci(n);
	}
	
	static void printFibnacci(int n) {
		int first = 0, second = 1;
		for(int i=1;i<=n;i++) {
			System.out.println(first+" ");
			int next = first + second;
			first = second;
			second = next;
		}
	}

}
