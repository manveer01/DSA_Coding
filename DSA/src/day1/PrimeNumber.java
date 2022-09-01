package day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int a = 138;
		System.out.println(isPrime(a));
	}
	
	public static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) return false;
		}
		return true;
	}

}
