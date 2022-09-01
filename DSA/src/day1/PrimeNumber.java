package day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int a = 29;
		System.out.println(isPrime(a));
	}
	
	//factor wont exceed the half of that number so doing n/2
//	public static boolean isPrime(int num) {
//		if(num<=1) return false;
//		for(int i=2;i<=num/2;i++) {
//			if(num%i==0) return false;
//		}
//		return true;
//	}
	
	
	public static boolean isPrime(int num) {
		if(num<=1) return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) return false;
		}
		return true;
	}

}
